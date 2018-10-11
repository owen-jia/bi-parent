package com.jcc.bi.web.model;

import com.jcc.bi.data.config.constant.Result;

public class WebParam extends Result {
    Integer code;
    String val;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
