package com.jcc.bi.web.controller;

import com.jcc.bi.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "demo")
public class DemoController {

    @Autowired
    DemoService demoServiceImpl;

    @RequestMapping(value = "test1",method = RequestMethod.GET)
    @ResponseBody
    public String test1(){
        String tmp = demoServiceImpl.test1();
        System.out.println(tmp);
        return tmp;
    }
}
