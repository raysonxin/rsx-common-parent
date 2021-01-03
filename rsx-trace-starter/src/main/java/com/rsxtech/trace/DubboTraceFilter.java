package com.rsxtech.trace;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;
import org.slf4j.MDC;
import org.springframework.util.ObjectUtils;

/**
 * 针对dubbo 服务provider和consumer支持traceId
 */
@Activate(group = {CommonConstants.CONSUMER_SIDE, CommonConstants.PROVIDER_SIDE}, order = -10000)
public class DubboTraceFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        if (RpcContext.getContext().isConsumerSide()) {
            String traceId = RpcContext.getContext().getAttachment(TraceContext.TRACE_ID_TAG);
            if (ObjectUtils.isEmpty(traceId)) {
                traceId = TraceContext.nextTraceId();
            }

            RpcContext.getContext().setAttachment(TraceContext.TRACE_ID_TAG, traceId);
        } else {
            String traceId = RpcContext.getContext().getAttachment(TraceContext.TRACE_ID_TAG);
            if (ObjectUtils.isEmpty(traceId)) {
                traceId = TraceContext.nextTraceId();
            }

            MDC.put(TraceContext.TRACE_ID_TAG, traceId);
            TraceContext.setTraceId(traceId);
        }
        try {
            return invoker.invoke(invocation);
        } finally {
            if (RpcContext.getContext().isProviderSide()) {
                MDC.remove(TraceContext.TRACE_ID_TAG);
                TraceContext.clear();
            }
        }
    }
}
