package com.rsxtech.trace;

import java.util.UUID;

public class TraceContext {

    public static final String TRACE_ID_TAG = "TRACE-ID";
    private static final ThreadLocal<String> TRACE_ID_CACHE = new ThreadLocal<String>();

//    /**
//     * 获取上下文traceId
//     */
//    public static String getTraceId() {
//        return TRACE_ID_CACHE.get();
//    }

    /**
     * 线程上下文设置traceId
     */
    public static void setTraceId(String traceId) {
        TRACE_ID_CACHE.set(traceId);
    }

    /**
     * 清除线程上下文
     */
    public static void clear() {
        TRACE_ID_CACHE.remove();
    }

    /**
     * 生成traceId
     *
     * @return traceId
     */
    public static String nextTraceId() {
        String traceId = TRACE_ID_CACHE.get();
        if (traceId == null) {
            traceId = UUID.randomUUID().toString().replace("-", "");
        }
        return traceId;
    }
}
