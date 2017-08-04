package com.jcc.bi.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.jcc.bi.data.*")
@MapperScan(value = "com.jcc.bi.data.mapper")
public class DataApp {

    public static void main(String[] args){
        SpringApplication.run(DataApp.class, args);
    }
}
