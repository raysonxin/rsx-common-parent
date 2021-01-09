package com.rsxtech.common.exception;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;

/**
 * 通用异常
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public class CommonException extends BaseException {

    public CommonException(IErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public CommonException(IErrorCodeEnum errorCodeEnum, Object[] args, String message) {
        super(errorCodeEnum, message);
    }

    public CommonException(IErrorCodeEnum errorCodeEnum, Object[] args, String message, Throwable cause) {
        super(errorCodeEnum, message, cause);
    }
}
