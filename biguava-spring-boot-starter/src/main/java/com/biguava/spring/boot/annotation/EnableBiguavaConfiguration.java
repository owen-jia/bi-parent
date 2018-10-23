package com.biguava.spring.boot.annotation;

import java.lang.annotation.*;

/**
 * biguava启动注解
 * @author: Owen Jia
 * @time: 2018/10/23 18:12
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableBiguavaConfiguration {
}
