package com.hp.docker_base.bean.em;

/**
 * @program: idaas
 * @description: 通用是否
 * @author: bee
 * @create: 2020-04-07 15:41
 **/
public enum EnumOKOrNG {
    NG("1","请求失败"),
    OK("0","请求成功");

    String code;
    String value;

    EnumOKOrNG(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
