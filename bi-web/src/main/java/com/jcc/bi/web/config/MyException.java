package com.jcc.bi.web.config;

import com.jcc.bi.web.constant.ResultCode;

/**
 * 系统基础异常类
 * Created by jiawj on 2017/9/14.
 */
public class MyException extends Exception{
    ResultCode resultCode;

    public MyException(String message, ResultCode resultCode) {
        super(message);
        this.resultCode = resultCode;
    }

    public MyException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
