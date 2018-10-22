package com.biguava.spring.boot;

import com.biguava.spring.boot.model.SayHello;
import com.biguava.spring.boot.service.impl.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置-配置类
 * @author: Owen Jia
 * @time: 2018/10/22 18:20
 */
@Configuration
@EnableConfigurationProperties({SayHello.class})
@ConditionalOnClass({SayHelloService.class})
@ConditionalOnProperty(prefix = "biguava",value = "true",matchIfMissing = true)
public class BiguavaAutoConfiguration {

    @Autowired
    SayHello sayHello;

    @Bean
    @ConditionalOnMissingBean(SayHelloService.class)
    public SayHelloService sayHelloService(){
        System.out.println("Execute Create New Bean:SayHelloService");
        SayHelloService sayHelloService = new SayHelloService();
        sayHelloService.setEnabled(sayHello.isEnabled());
        return sayHelloService;
    }
}
