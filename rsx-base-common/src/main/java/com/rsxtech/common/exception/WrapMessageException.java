package com.rsxtech.common.exception;

/**
 * 异常包装
 * 只包装了 错误信息 的 {@link RuntimeException}.
 * 用于 {@link com.rsxtech.common.exception.assertion.Assert} 中用于包装自定义异常信息。
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public class WrapMessageException extends RuntimeException {

    public WrapMessageException(String message) {
        super(message);
    }

    public WrapMessageException(String message, Throwable cause) {
        super(message, cause);
    }

}
