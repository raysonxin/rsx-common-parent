package com.rsxtech.common.exception;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;

/**
 * 异常基类
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public abstract class BaseException extends RuntimeException {

    public static final long serialVersionUID = 4299499805380449963L;

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

    public BaseException(IErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.errorCodeEnum = errorCodeEnum;
    }

    public BaseException(IErrorCodeEnum errorCodeEnum, String message) {
        super(message);
        this.errorCodeEnum = errorCodeEnum;
    }

    public BaseException(IErrorCodeEnum errorCodeEnum, String message, Throwable cause) {
        super(message, cause);
        this.errorCodeEnum = errorCodeEnum;
    }

    public BaseException(String code, String message) {
        super(message);
        this.errorCodeEnum = new IErrorCodeEnum() {
            @Override
            public String getCode() {
                return code;
            }

            @Override
            public String getMessage() {
                return message;
            }
        };
    }
}
