package com.sample.bi.service;

import com.sample.bi.model.MemberInfo;

/**
 * @author: Owen Jia
 * @time: 2018/10/11 16:06
 */
public interface IMemberInfoService {

    MemberInfo queryMemberInfo(Long id);
}
