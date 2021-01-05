package com.rsxtech.error.assertion;

import com.rsxtech.error.enums.IErrorCodeEnum;
import com.rsxtech.error.exception.BaseException;
import com.rsxtech.error.exception.BizException;

import java.text.MessageFormat;

/**
 * 业务异常断言
 */
public interface BizExceptionAssert extends IErrorCodeEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = this.getMessage();
        if (null != args && args.length > 0) {
            msg = MessageFormat.format(this.getCode(), args);
        }
        return new BizException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable cause, Object... args) {
        String msg = this.getMessage();
        if (null != args && args.length > 0) {
            msg = MessageFormat.format(this.getCode(), args);
        }
        return new BizException(this, args, msg, cause);
    }
}
