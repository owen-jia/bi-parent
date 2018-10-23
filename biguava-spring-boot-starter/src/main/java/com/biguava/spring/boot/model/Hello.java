package com.biguava.spring.boot.model;

/**
 * @author: Owen Jia
 * @time: 2018/10/22 18:11
 */
public class Hello {

    String keys;
    String desc;

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

    @Override
    public String toString() {
        return "Hello{" +
                "keys='" + keys + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
