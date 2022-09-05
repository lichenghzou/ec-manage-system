package com.qf.ec.common.handler;

import com.qf.ec.common.result.ResponseResult;
import com.qf.ec.common.ex.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *  如何全局异常
 */
//1.定义全局异常类
@RestControllerAdvice
public class GlobleExceptionHandler {

    //2.定义异常处理方法
    @ExceptionHandler(Exception.class)
    public ResponseResult<Object> handlerException(Exception ex){
        System.out.println(ex.getMessage());
        return ResponseResult.error();
    }

    @ExceptionHandler(ServiceException.class)
    public ResponseResult<Object> handlerException(ServiceException ex){
        System.out.println(ex.getMessage());
        return ResponseResult.error(ex.getResponseCode());
    }
}
