package com.jcc.bi.web.config;

import com.jcc.bi.data.config.constant.ResultCode;
import com.jcc.bi.data.config.constant.ResultDefault;
import com.jcc.bi.data.config.constant.ResultError;
import com.jcc.bi.data.config.constant.ResultException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 全局异常捕获
 * @author: Owen Jia
 * @time: 2018/10/8 17:46
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({Exception.class, RuntimeException.class})
    @ResponseBody
    ResultDefault doHandler(Exception e){
        ResultDefault errorResult;

        if(e instanceof ResultException){
            ResultException me = (ResultException) e;
            errorResult = me.getResultError();
        } else {
            e.printStackTrace();
            errorResult = new ResultError(ResultCode.system_error);
        }
        return errorResult;
    }
}
