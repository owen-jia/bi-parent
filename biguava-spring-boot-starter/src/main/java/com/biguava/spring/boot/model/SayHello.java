package com.biguava.spring.boot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: Owen Jia
 * @time: 2018/10/22 18:11
 */
@ConfigurationProperties(prefix = "biguava")
public class SayHello {
    /**
     * 是否启动类
     */
    boolean enabled;

    String keys;
    String desc;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
