package com.jcc.bi.data.controller;

import com.jcc.bi.data.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "data")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "test1",method = RequestMethod.GET)
    @ResponseBody
    public String test1(){
        return testService.test();
    }
}
