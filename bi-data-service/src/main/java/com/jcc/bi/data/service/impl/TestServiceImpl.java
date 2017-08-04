package com.jcc.bi.data.service.impl;

import com.jcc.bi.data.mapper.AaaMapper;
import com.jcc.bi.data.model.dao.Aaa;
import com.jcc.bi.data.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Autowired(required = false)
    AaaMapper aaaMapper;

    public String test() {

        Aaa tmp = new Aaa();
        tmp.setId((short)1);

        tmp = aaaMapper.selectOne(tmp);

        return "data-service:" + tmp.getName();
    }
}
