package com.sample.bi.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author: Owen Jia
 * @time: 2018/11/7 18:15
 */
@Repository
public class DulicpteDataSourceDao {

    @Qualifier("dataSource2")
    @Autowired
    DataSource dataSource;

    public void test1(){
    }
}
