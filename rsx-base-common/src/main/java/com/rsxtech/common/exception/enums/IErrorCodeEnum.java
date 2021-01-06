package com.rsxtech.common.exception.enums;

/**
 * 错误码枚举接口
 */
public interface IErrorCodeEnum {

    /**
     * 获取错误码
     */
    String getCode();

    /**
     * 获取错误描述信息
     */
    String getMessage();
}
