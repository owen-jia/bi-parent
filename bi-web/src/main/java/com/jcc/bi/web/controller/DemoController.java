package com.jcc.bi.web.controller;

import com.jcc.bi.web.config.MyException;
import com.jcc.bi.web.model.Result;
import com.jcc.bi.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "demo")
public class DemoController extends BaseController{

    @Autowired
    DemoService demoServiceImpl;

    @RequestMapping(value = "test1",method = RequestMethod.GET)
    @ResponseBody
    public Result test1() throws MyException{
        String tmp = demoServiceImpl.test1();
        logger.info(tmp);

        demoServiceImpl.test2();
        return Result.successResult();
    }
}
