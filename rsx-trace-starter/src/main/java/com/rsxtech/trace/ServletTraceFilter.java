package com.rsxtech.trace;

import org.slf4j.MDC;
import org.springframework.util.ObjectUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 基于Servlet的过滤器，为HTTP请求增加traceId。
 */
public class ServletTraceFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String traceId = request.getHeader(TraceContext.TRACE_ID_TAG);
        try {
            if (ObjectUtils.isEmpty(traceId)) {
                traceId = TraceContext.nextTraceId();
            }
            TraceContext.setTraceId(traceId);
            MDC.put(TraceContext.TRACE_ID_TAG, traceId);

            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.setHeader(TraceContext.TRACE_ID_TAG, traceId);

            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            MDC.remove(TraceContext.TRACE_ID_TAG);
            TraceContext.clear();
        }
    }
}
