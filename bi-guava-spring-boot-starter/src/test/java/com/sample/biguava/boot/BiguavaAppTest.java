package com.sample.biguava.boot;

import com.sample.biguava.boot.service.impl.SayHelloServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: Owen Jia
 * @time: 2018/10/22 18:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BiguavaApp.class)
public class BiguavaAppTest {

    @Autowired(required = false)
    SayHelloServiceImpl sayHelloService;

    @Test
    public void test1(){
        System.out.println("this is ok");
    }
}
