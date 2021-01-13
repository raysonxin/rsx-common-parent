package com.rsxtech.common.exception.assertion;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;
import com.rsxtech.common.exception.BaseException;
import com.rsxtech.common.exception.CommonException;

import java.text.MessageFormat;

/**
 * 通用异常断言
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public interface CommonExceptionAssert extends IErrorCodeEnum, Assert {
    @Override
    default BaseException newException(Object... args) {
        String msg = this.getMessage();
        if (null != args && args.length > 0) {
            msg = MessageFormat.format(this.getMessage(), args);
        }

        return new CommonException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = this.getMessage();
        if (null != args && args.length > 0) {
            msg = MessageFormat.format(this.getMessage(), args);
        }

        return new CommonException(this, args, msg, t);
    }
}
