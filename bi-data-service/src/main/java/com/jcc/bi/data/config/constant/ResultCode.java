package com.jcc.bi.data.config.constant;

/**
 * 错误码
 * @author: Owen Jia
 * @time: 2018/10/8 16:18
 */
public enum ResultCode {
    system_error(-1,"系统异常"),
    success(0,"操作成功")
    ;

    int code;
    String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
