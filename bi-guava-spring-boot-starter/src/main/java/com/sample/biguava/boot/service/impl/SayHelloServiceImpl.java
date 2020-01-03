package com.sample.biguava.boot.service.impl;

import com.sample.biguava.boot.BiguavaProperties;

/**
 * hello模块提供的服务
 * @author: Owen Jia
 */
public class SayHelloServiceImpl {

    BiguavaProperties biguavaProperties;

    public String say() {
        return "SayHelloServiceImpl Starter ===============>>>>" + biguavaProperties.getHello().toString();
    }

    public BiguavaProperties getBiguavaProperties() {
        return biguavaProperties;
    }

    public void setBiguavaProperties(BiguavaProperties biguavaProperties) {
        this.biguavaProperties = biguavaProperties;
    }

}
