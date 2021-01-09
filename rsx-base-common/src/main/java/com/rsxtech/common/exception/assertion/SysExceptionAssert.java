package com.rsxtech.common.exception.assertion;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;
import com.rsxtech.common.exception.BaseException;
import com.rsxtech.common.exception.SysException;

import java.text.MessageFormat;

/**
 * 系统异常断言
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public interface SysExceptionAssert extends IErrorCodeEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = this.getMessage();
        if (null != args && args.length > 0) {
            msg = MessageFormat.format(this.getMessage(), args);
        }
        return new SysException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable cause, Object... args) {
        String msg = this.getMessage();
        if (null != args && args.length > 0) {
            msg = MessageFormat.format(this.getMessage(), args);
        }
        return new SysException(this, args, msg, cause);
    }
}
