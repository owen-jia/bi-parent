package com.biguava.spring.boot;

/**
 * 配置
 * @author: Owen Jia
 * @time: 2018/10/22 18:47
 */
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
