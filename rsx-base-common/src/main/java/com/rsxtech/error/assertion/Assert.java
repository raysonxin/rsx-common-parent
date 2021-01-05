package com.rsxtech.error.assertion;

import com.rsxtech.error.exception.BaseException;

/**
 * 断言
 */
public interface Assert {
    /**
     * 创建异常对象
     *
     * @param args 格式化参数
     * @return 异常对象
     */
    BaseException newException(Object... args);

    /**
     * 创建异常对象
     *
     * @param args  格式化参数
     * @param cause 异常原因
     * @return 异常对象
     */
    BaseException newException(Throwable cause, Object... args);

    /**
     * 断言对象 <code>obj</code> 非空。
     * 如果<code>obj</code>为空，则抛出异常。
     */
    default void assertNotNull(Object obj) {
        if (obj == null) {
            throw newException();
        }
    }
}
