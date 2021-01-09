package com.rsxtech.common.exception.assertion;

import com.rsxtech.common.exception.enums.IErrorCodeEnum;
import com.rsxtech.common.exception.BaseException;
import com.rsxtech.common.exception.BizException;

import java.text.MessageFormat;

/**
 * 业务异常断言
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public interface BizExceptionAssert extends IErrorCodeEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = this.getMessage();
        if (null != args && args.length > 0) {
            msg = MessageFormat.format(this.getMessage(), args);
        }
        return new BizException(this, msg);
    }

    @Override
    default BaseException newException(Throwable cause, Object... args) {
        String msg = this.getMessage();
        if (null != args && args.length > 0) {
            msg = MessageFormat.format(this.getMessage(), args);
        }
        return new BizException(this, args, msg, cause);
    }
}
