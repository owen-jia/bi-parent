package com.ts.bi.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * 默认拦截器
 * 1、统计接口执行耗时
 * @author: Owen Jia
 * @time: 2018/10/11 13:55
 */
public class DefaultInterceptor implements WebRequestInterceptor {
    static Logger logger = LoggerFactory.getLogger(DefaultInterceptor.class);

    @Override
    public void preHandle(WebRequest request) throws Exception {
        request.setAttribute("startTime",System.currentTimeMillis(),RequestAttributes.SCOPE_REQUEST);
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        Long endTime = System.currentTimeMillis();
        Long startTime = Long.valueOf(request.getAttribute("startTime",RequestAttributes.SCOPE_REQUEST).toString());
        logger.info("[DefaultInterceptor] " +((ServletWebRequest)request).getRequest().getRequestURI()+ "耗时：" + (endTime-startTime) /1000 + "s");
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {

    }
}
