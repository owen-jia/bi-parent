package com.jcc.bi.web.config;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jiawj on 2017/9/4.
 */
public class AuthInterceptor extends HandlerInterceptorAdapter{

    final static Logger logger = Logger.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("[AuthInterceptor] url:"+request.getRequestURI());
        return super.preHandle(request, response, handler);
    }
}
