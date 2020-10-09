package com.hp.docker_base.bean.constrains.group.customize;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * 字母大小写校验器
 */
public class CaseCheckValidator implements ConstraintValidator<CaseCheck, String> {
    //大小写的枚举
    private CaseMode caseMode;

    @Override
    public void initialize(CaseCheck caseCheck) {
        this.caseMode = caseCheck.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        //如果文本是空,则不进行校验，因为有其他的注解是可以校验空或者空字符串的
        if (null == value)
            return true;

        //文本只能是字母的正则
        String pattern = "[a-zA-Z]+";
        //校验传进来的是否是只包含了字母的文本
        boolean isMatch = Pattern.matches(pattern, value);
        //如果存在其他字符则返回校验失败
        if (!isMatch)
            return false;

        //如果没有指定方式，则直接返回false
        if (null == caseMode)
            return false;

        //判断是否符合大小写条件
        if (caseMode == CaseMode.UPPER) {
            return value.equals(value.toUpperCase());
        } else {
            return value.equals(value.toLowerCase());
        }
    }
}


