package com.biguava.spring.boot;

import com.biguava.spring.boot.annotation.EnableBiguavaConfiguration;
import com.biguava.spring.boot.service.impl.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置-配置类
 * ConditionalOn* 自动配置启动条件
 * ConditionalOnProperty 通过判断biguava.enabled是否等于true启动自动配置
 * ConditionalOnBean 通过判断EnableBiguavaConfiguration注解是否使用启动自动配置
 * ConditionalOnClass 判断类文件是否存在
 * @author: Owen Jia
 * @time: 2018/10/22 18:20
 */
@Configuration
@EnableConfigurationProperties(BiguavaProperties.class)
@ConditionalOnBean(annotation = EnableBiguavaConfiguration.class)
//@ConditionalOnProperty(prefix = "biguava",value = "enabled",matchIfMissing = true)
public class BiguavaAutoConfiguration {

    @Autowired(required = false)
    BiguavaProperties biguavaProperties;

    @Bean
    public SayHelloService sayHelloService(){
        System.out.println("biguava.enabled= " + biguavaProperties.isEnabled());
        System.out.println("Execute Create New Bean: SayHelloService");

        SayHelloService sayHelloService = new SayHelloService();
        sayHelloService.setBiguavaProperties(biguavaProperties);
        return sayHelloService;
    }
}
