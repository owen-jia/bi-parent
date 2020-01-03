package com.sample.bi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sample.bi.model.MemberInfo;
import com.sample.bi.service.IMemberInfoService;

/**
 * @author: Owen Jia
 * @time: 2018/10/23 17:35
 */
@Service(interfaceClass = IMemberInfoService.class)
public class MemberInfoServiceImpl implements IMemberInfoService {
    @Override
    public MemberInfo queryMemberInfo(Long id) {
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setId(id == null ? 101010L: id);
        memberInfo.setFullName("Owen Jia");
        memberInfo.setCode("hello world");
        return memberInfo;
    }
}
