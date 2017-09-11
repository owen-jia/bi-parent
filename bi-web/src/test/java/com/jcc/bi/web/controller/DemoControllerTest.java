package com.jcc.bi.web.controller;

import com.jcc.bi.web.WebAppTest;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by jiawj on 2017/9/11.
 */
@WebAppConfiguration
public class DemoControllerTest extends WebAppTest{

    @Test
    public void test1(){
        System.out.println("hello world, this is test1 method.");
    }
}
