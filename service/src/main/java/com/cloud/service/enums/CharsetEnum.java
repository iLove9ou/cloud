package com.cloud.service.enums;

public enum  CharsetEnum {

    UTF8(1, "UTF-8");

    private Integer code;
    private String name;

    CharsetEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
