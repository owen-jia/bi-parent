package com.jcc.bi.web.controller;

import com.biguava.spring.boot.service.impl.SayHelloServiceImpl;
import com.jcc.bi.data.service.TestService;
import com.jcc.bi.data.service.dubbo.MemberInfoDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 业务controller
 */
@Controller
@RequestMapping(value = "demo")
public class DemoController extends BaseController{

    @Autowired(required = false)
    TestService testService;
    @Autowired(required = false)
    MemberInfoDubboService memberInfoDubboService;
    @Autowired(required = false)
    SayHelloServiceImpl sayHelloService;

    @RequestMapping(value = "test1",method = RequestMethod.GET)
    @ResponseBody
    public String test1(){
        memberInfoDubboService.test1();
        return testService.test();
    }

    @GetMapping("test2")
    @ResponseBody
    public String test2(){
        return sayHelloService.say();
    }
}
