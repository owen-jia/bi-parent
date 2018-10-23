package com.jcc.bi.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.biguava.spring.boot.annotation.EnableBiguavaConfiguration;
import com.biguava.spring.boot.service.impl.SayHelloService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@MapperScan("com.jcc.bi.data.dao")
@ComponentScan(basePackages = "com.jcc.bi.*")
@EnableDubboConfiguration
@EnableBiguavaConfiguration
public class WebApp {

    public static void main(String[] args){
        SpringApplication.run(WebApp.class, args);
    }

}
