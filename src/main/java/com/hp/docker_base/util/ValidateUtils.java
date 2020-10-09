package com.hp.docker_base.util;


import com.hp.docker_base.bean.exception.EnumStaffException;
import com.hp.docker_base.bean.exception.ServiceException;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 校验参数工具类
 * bee
 * 2020/04/08
 */
public class ValidateUtils {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * validate the object ,return null if it's validated ,otherwise error messages
     *
     * @param obj
     * @param properties
     * @return
     */
    public static String validate(Object obj, String... properties) {
        Set<ConstraintViolation<Object>> constraints = new HashSet<>();
        if (properties.length == 0) {
            constraints.addAll(validator.validate(obj));
        } else {
            for (String property : properties) {
                constraints.addAll(validator.validateProperty(obj, property));
            }
        }
        return pickErrorMessage(constraints);
    }

    /**
     * validate a value use the annotations on the propertyName  of bean type ,return null if it's validated ,otherwise error message
     *
     * @param bean
     * @param propertyName
     * @param value
     * @return
     */
    public static String validateValue(Class bean, String propertyName, Object value,Class... groups) {
        Set<ConstraintViolation<Object>> constraints = validator.validateValue(bean, propertyName, value,groups);
        if (constraints != null && !constraints.isEmpty()) {
            for (ConstraintViolation<Object> constraint : constraints) {
                return constraint.getMessage();
            }
        }
        return null;
    }

    /**
     * validate all values in the group ,return null if it's validated ,otherwise error message
     *
     * @param bean
     * @param group
     * @return
     */
    public static String validateGroup(Object bean, Class group) {
        Set<ConstraintViolation<Object>> constraints = validator.validate(bean, group);
        return pickErrorMessage(constraints);
    }

    private static String pickErrorMessage(Set<ConstraintViolation<Object>> constraints) {
        if (constraints != null && !constraints.isEmpty()) {
            List<String> messages = new ArrayList<>();
            for (ConstraintViolation<Object> constraint : constraints) {
               // messages.add("["+constraint.getPropertyPath().toString() +"="+constraint.getInvalidValue()+ "]:" + constraint.getMessage());
               // messages.add("["+constraint.getInvalidValue()+ "]:" + constraint.getMessage());
                messages.add(constraint.getMessage());
            }
            String errorMsg = StringUtils.join(messages, ',');
            if(StringUtils.isNotEmpty(errorMsg)){
                throw new ServiceException(EnumStaffException.ERROR_STAFF_ATTR_INTEGRITY.getCode(),
                        errorMsg);
            }
            return errorMsg;
        }
        return null;
    }

}
