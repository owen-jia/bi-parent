package com.biguava.spring.boot.service.impl;

import com.biguava.spring.boot.BiguavaProperties;

/**
 * hello模块提供的服务
 * @author: Owen Jia
 * @time: 2018/10/22 18:18
 */
public class SayHelloService {

    BiguavaProperties biguavaProperties;

    public String say() {
        return "SayHelloService Starter ===============>>>>" + biguavaProperties.getHello().toString();
    }

    public BiguavaProperties getBiguavaProperties() {
        return biguavaProperties;
    }

    public void setBiguavaProperties(BiguavaProperties biguavaProperties) {
        this.biguavaProperties = biguavaProperties;
    }

}
