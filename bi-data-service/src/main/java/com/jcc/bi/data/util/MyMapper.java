package com.jcc.bi.data.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 * @author Owen Jia
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
