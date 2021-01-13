package com.rsxtech.common.exception.enums;

import com.rsxtech.common.exception.assertion.CommonExceptionAssert;

public enum CommonCodeEnum implements CommonExceptionAssert {

    OBJECT_NULL_ERROR("100000", "数据对象[{0}]不能为空"),
    ;

    CommonCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;

    private String message;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
