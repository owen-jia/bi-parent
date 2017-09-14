package com.jcc.bi.web.model;

import com.jcc.bi.web.constant.ResultCode;

/**
 * 返回数据
 * Created by jiawj on 2017/9/14.
 */
public class Result {

    int code;
    ResultCode msg;
    Object data;

    public Result(int code, ResultCode msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result errorResult(){
        return new Result(ResultCode.error.getCode(),ResultCode.error,null);
    }

    public static Result errorResult(ResultCode resultCode){
        return new Result(resultCode.getCode(),resultCode,null);
    }

    public static Result successResult(){
        return new Result(ResultCode.success.getCode(),ResultCode.success,null);
    }

    public static Result successResult(Object data){
        return new Result(ResultCode.success.getCode(),ResultCode.success,data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ResultCode getMsg() {
        return msg;
    }

    public void setMsg(ResultCode msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
