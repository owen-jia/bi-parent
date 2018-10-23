package com.biguava.spring.boot;

import com.biguava.spring.boot.model.Hello;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 配置
 * @author: Owen Jia
 * @time: 2018/10/22 18:47
 */
@ConfigurationProperties(prefix = "biguava",ignoreInvalidFields = true)
public class BiguavaProperties {
    /**
     * 是否启动
     */
    boolean enabled;
    /**
     * 监控级别：
     * height： 高级
     * lower ： 低级
     */
    String level;
    /**
     * 监控频率
     * 单位：分钟
     */
    int monitorTime;

    /**
     * hello模块配置
     */
    Hello hello;

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(int monitorTime) {
        this.monitorTime = monitorTime;
    }
}
