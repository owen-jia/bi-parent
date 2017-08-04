package com.jcc.bi.web.service.impl;

import com.jcc.bi.web.mapper.BiDemoMapper;
import com.jcc.bi.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    BiDemoMapper biDemoMapper;

    public String test1() {
        Integer id = 1;
        return biDemoMapper.selectByPrimaryKey(id).getDescs();
    }
}
