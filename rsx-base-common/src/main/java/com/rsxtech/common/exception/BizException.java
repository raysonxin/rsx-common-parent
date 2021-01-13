package com.rsxtech.common.exception;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;

/**
 * 业务异常
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public class BizException extends BaseException {
    public BizException(IErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public BizException(IErrorCodeEnum errorCodeEnum, String message) {
        super(errorCodeEnum, message);
    }

    public BizException(IErrorCodeEnum errorCodeEnum, String message, Throwable throwable) {
        super(errorCodeEnum, message, throwable);
    }

    public BizException(IErrorCodeEnum errorCodeEnum, Object[] args, String message) {
        super(errorCodeEnum, message);
    }

    public BizException(IErrorCodeEnum errorCodeEnum, Object[] args, String message, Throwable throwable) {
        super(errorCodeEnum, message, throwable);
    }
}
