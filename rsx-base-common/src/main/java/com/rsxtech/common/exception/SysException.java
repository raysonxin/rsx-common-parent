package com.rsxtech.common.exception;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;

/**
 * 系统异常
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public class SysException extends BaseException {
    public SysException(IErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public SysException(IErrorCodeEnum errorCodeEnum, Object[] args, String message) {
        super(errorCodeEnum, message);
    }

    public SysException(IErrorCodeEnum errorCodeEnum, Object[] args, String message, Throwable throwable) {
        super(errorCodeEnum, message, throwable);
    }
}
