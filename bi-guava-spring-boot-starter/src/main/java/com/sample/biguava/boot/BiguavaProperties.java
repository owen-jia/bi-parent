package com.sample.biguava.boot;

import com.sample.biguava.boot.model.Hello;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置
 * @author: Owen Jia
 * @time: 2018/10/12 18:47
 */
@ConfigurationProperties(prefix = "biguava",ignoreInvalidFields = true)
public class BiguavaProperties {
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

    /**
     * print模块
     */
    Print print;

    public static class Print{
        boolean enabled;
        int cycleTime;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public int getCycleTime() {
            return cycleTime;
        }

        public void setCycleTime(int cycleTime) {
            this.cycleTime = cycleTime;
        }
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
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
