package com.hp.docker_base.bean.exception;

/**
 *  员工异常枚举类
 *  bee
 * 2020/4/7 23:15:21
 */
public enum EnumStaffException {

    ERROR_STAFF_ATTR_INTEGRITY("100001", "数据有空字段"),

    // 自定义扩展属性相关异常Code定义
    ERROR_STAFF_IDCARD_EXIST("100002", "员工身份证号存在"),
    ERROR_STAFF_PHONE_EXIST("100003", "手机号存在"),


    ERROR_STAFF_DEPT_NOT_EXIST("100004","员工部门不存在"),
    ERROR_STAFF_POSITION_NOT_EXIST("100005","员工岗位不存在"),
    ERROR_STAFF_ORG_NOT_EXIST("100006","员工企业不存在");

   // ERROR_EXTEND_ATTRIBUTE_CATEGORY_NULL("200003", "未选择扩展属性的所属分类！");

    String code;
    String message;

    EnumStaffException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
