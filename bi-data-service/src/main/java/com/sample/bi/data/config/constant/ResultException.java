package com.sample.bi.data.config.constant;

/**
 * @author: Owen Jia
 * @time: 2018/10/8 15:56
 */
public class ResultException extends Exception{

    ResultError resultError;

    public ResultException() {
    }

    public ResultException(ResultError resultError) {
        this.resultError = resultError;
    }

    public ResultException(ResultError resultError, String msg) {
        resultError.setErrorMsg(msg);
        this.resultError = resultError;
    }

    public ResultError getResultError() {
        return resultError;
    }

    public void setResultError(ResultError resultError) {
        this.resultError = resultError;
    }
}
