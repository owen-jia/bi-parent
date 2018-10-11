package com.jcc.bi.service;

import com.jcc.bi.model.MemberInfo;

/**
 * @author: Owen Jia
 * @time: 2018/10/11 16:06
 */
public interface IMemberInfoService {

    MemberInfo queryMemberInfo(Long id);
}
