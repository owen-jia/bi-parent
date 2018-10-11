package com.jcc.bi.web.config;

import com.jcc.bi.web.interceptor.DefaultInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Web配置
 * @author Owen Jia
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    static Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addWebRequestInterceptor(new DefaultInterceptor()).addPathPatterns("/**");
    }
}
