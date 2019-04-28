package com.ts.bi.data.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 线程内共享存储
 * @author: Owen Jia
 * @time: 2018/10/11 14:01
 */
public class ThreadContextHolder {

    static ThreadLocal<Map<String,Object>> mapThreadLocal = new ThreadLocal<>();
    static Logger logger = LoggerFactory.getLogger(ThreadContextHolder.class);

    public static void setAttr(String key, Object object) {
        logger.debug("设置线程属性 key:{}, value: {}", key, object);
        getAttrs().put(key, object);
    }

    public static Object getAttr(String key) {
        Object value = getAttrs().get(key);
        logger.debug("设置线程属性 key:{}, value: {}", key, value);
        return value;
    }

    private static Map<String, Object> getAttrs() {
        Map<String, Object> attrs = mapThreadLocal.get();
        if (attrs == null) {
            attrs = new HashMap<>();
        }
        mapThreadLocal.set(attrs);
        return attrs;
    }

    public static void cleanAttrs() {
        mapThreadLocal.set(new HashMap<String, Object>());
    }

    public static void removeAttr(String key) {
        getAttrs().remove(key);
    }

}
