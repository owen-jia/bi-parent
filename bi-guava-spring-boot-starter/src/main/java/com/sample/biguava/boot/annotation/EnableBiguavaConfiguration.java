package com.sample.biguava.boot.annotation;

import java.lang.annotation.*;

/**
 * biguava启动注解
 * @author: Owen Jia
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableBiguavaConfiguration {
}
