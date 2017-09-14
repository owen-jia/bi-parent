package com.jcc.bi.web.config;

import com.jcc.bi.web.model.Result;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理
 * Created by jiawj on 2017/9/14.
 */
@ControllerAdvice
public class MyExceptionHandler {
    final static Logger logger = Logger.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionHandle(Exception e){

        if(e instanceof MyException){
            MyException myException = (MyException) e;
            logger.info("[MyExceptionHandler]"+myException.getResultCode()+" " + e.getMessage());
            return Result.errorResult(myException.getResultCode());
        } else {
            logger.info("[MyExceptionHandler]"+e.getMessage());
        }

        return Result.errorResult();
    }
}
