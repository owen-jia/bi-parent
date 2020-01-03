package com.sample.bi.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.sample.biguava.boot.annotation.EnableBiguavaConfiguration;
import com.sample.bi.web.config.constant.ENV;
import com.sample.bi.web.config.constant.ENV;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 服务启动入口
 * @author Owen Jia
 */
@SpringBootApplication
@MapperScan("com.sample.bi.data.dao")
@ComponentScan(basePackages = "com.sample.bi.*")
@EnableDubboConfiguration
@EnableBiguavaConfiguration
public class WebApp {

    static ENV env = ENV.local;

    public static void main(String[] args){
        WebApp.initEnv();
        SpringApplication app = new SpringApplication(WebApp.class);
        app.run(args);
    }

    static void initEnv(){
        String env = System.getProperty("ENV");
        match(env);
    }

    public static void match(String env){
        if(env == null || env.length() ==0) return;
        ENV[] ss = com.sample.bi.web.config.constant.ENV.values();
        for(int i=0; i< ss.length; i++){
            if(ss[i].name().equals(env)){
                WebApp.env = ss[i];
            }
        }
    }

}
