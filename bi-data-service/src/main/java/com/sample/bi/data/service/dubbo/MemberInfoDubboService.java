package com.sample.bi.data.service.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sample.bi.service.IMemberInfoService;
import org.springframework.stereotype.Service;

/**
 * @author: Owen Jia
 * @time: 2018/10/11 16:09
 */
@Service
public class MemberInfoDubboService {

    @Reference(check = false)
    IMemberInfoService memberInfoService;

    public void test1(){
        memberInfoService.queryMemberInfo(92838L);
    }
}
