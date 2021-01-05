package com.rsxtech.error.exception;

import com.rsxtech.error.enums.IErrorCodeEnum;

/**
 * 业务异常
 */
public class BizException extends BaseException {
    public BizException(IErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public BizException(IErrorCodeEnum errorCodeEnum, Object[] args, String message) {
        super(errorCodeEnum, args, message);
    }

    public BizException(IErrorCodeEnum errorCodeEnum, Object[] args, String message, Throwable throwable) {
        super(errorCodeEnum, args, message, throwable);
    }
}
