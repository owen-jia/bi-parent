package com.jcc.bi.web.constant;

/**
 * 错误常量
 * Created by jiawj on 2017/9/14.
 */
public enum ResultCode {
    success(0,"成功"),
    error(-1,"系统错误"),

    invalid_request_parameter(1,"请求参数不合法");

    private int code;
    private String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
