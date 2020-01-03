package com.sample.bi.data.config.constant;

/**
 * @author: Owen Jia
 * @time: 2018/10/8 17:56
 */
public class ResultError extends ResultDefault {

    int code;
    String errorMsg;

    public ResultError(ResultCode errorCode) {
        this.code = errorCode.code;
        this.errorMsg = errorCode.msg;
    }

    public ResultError(ResultCode errorCode, String errorMsg) {
        this.code = errorCode.code;
        this.errorMsg = errorMsg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
