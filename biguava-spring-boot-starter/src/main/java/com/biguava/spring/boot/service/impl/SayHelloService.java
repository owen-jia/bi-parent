package com.biguava.spring.boot.service.impl;

/**
 * @author: Owen Jia
 * @time: 2018/10/22 18:18
 */
public class SayHelloService {
    /**
     * 控制服务是否启动
     */
    boolean enabled;

    public String haloHello() {
        return "Hello Starter ===============>>>>" + enabled;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
