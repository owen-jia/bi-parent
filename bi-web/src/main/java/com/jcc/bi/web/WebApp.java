package com.jcc.bi.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.jcc.bi.data.dao")
@ComponentScan(basePackages = "com.jcc.bi.*")
@EnableDubboConfiguration
public class WebApp {

    public static void main(String[] args){
        SpringApplication.run(WebApp.class, args);
    }
}
