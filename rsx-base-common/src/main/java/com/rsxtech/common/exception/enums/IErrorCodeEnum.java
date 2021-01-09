package com.rsxtech.common.exception.enums;

/**
 * 错误码接口
 *
 * 该接口是由业务代码直接使用的错误断言枚举的基础接口，本包仅提供 {@link CommonCodeEnum} 作为参考，使用方可以自行扩展。
 *
 * @author raysonxin
 * @since 2021-01-06
 */
public interface IErrorCodeEnum {

    /**
     * 获取错误码
     */
    String getCode();

    /**
     * 获取错误描述信息
     */
    String getMessage();
}
