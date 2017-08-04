package com.jcc.bi.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.jcc.bi.web.mapper")
@ComponentScan(basePackages = "com.jcc.bi.web.*")
public class WebApp {

    public static void main(String[] args){
        SpringApplication.run(WebApp.class, args);
    }
}
