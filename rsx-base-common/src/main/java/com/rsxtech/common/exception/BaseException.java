package com.rsxtech.common.exception;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;

/**
 * 异常基类
 */
public abstract class BaseException extends RuntimeException {

    /**
     * 错误码
     */
    private IErrorCodeEnum errorCodeEnum;

    /**
     * 获取错误码
     */
    public IErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }

    protected Object[] args;

    public BaseException(IErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.errorCodeEnum = errorCodeEnum;
    }

    public BaseException(IErrorCodeEnum errorCodeEnum, Object[] args, String message) {
        super(message);
        this.errorCodeEnum = errorCodeEnum;
        this.args = args;
    }

    public BaseException(IErrorCodeEnum errorCodeEnum, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.errorCodeEnum = errorCodeEnum;
        this.args = args;
    }
}
