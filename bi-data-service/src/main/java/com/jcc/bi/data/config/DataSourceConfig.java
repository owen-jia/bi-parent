package com.jcc.bi.data.config;

import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 多数据源配置
 * @author: Owen Jia
 * @time: 2018/10/11 15:30
 */
@Configuration
public class DataSourceConfig {

    @Bean(name="dataSource1")
    public DataSource test1(){
        return null;
    }

    @Bean(name="dataSource2")
    public DataSource test2(){
        return null;
    }

}