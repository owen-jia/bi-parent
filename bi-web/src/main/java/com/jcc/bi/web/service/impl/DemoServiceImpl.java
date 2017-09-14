package com.jcc.bi.web.service.impl;

import com.jcc.bi.web.config.MyException;
import com.jcc.bi.web.constant.ResultCode;
import com.jcc.bi.web.mapper.BiDemoMapper;
import com.jcc.bi.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired(required = false)
    BiDemoMapper biDemoMapper;

    public String test1(){
        Integer id = 1;
        return biDemoMapper.selectByPrimaryKey(id).getDescs();
    }

    public void test2() throws MyException {
        throw new MyException(ResultCode.invalid_request_parameter);
    }
}
