package com.rsxtech.common.exception;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;

/**
 * 系统异常
 */
public class SysException extends BaseException {
    public SysException(IErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public SysException(IErrorCodeEnum errorCodeEnum, Object[] args, String message) {
        super(errorCodeEnum, args, message);
    }

    public SysException(IErrorCodeEnum errorCodeEnum, Object[] args, String message, Throwable throwable) {
        super(errorCodeEnum, args, message, throwable);
    }
}
