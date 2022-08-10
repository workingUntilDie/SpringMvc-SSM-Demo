package com.controller;

import com.exception.BusinessException;
import com.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 该类是异常处理功能
 */

//1.声明该类是做异常处理的
@RestControllerAdvice
public class ProjectExceptionAdvice {

    //2.写一个方法用于处理异常 @ExceptionHandler()表示拦截异常括号内写拦截异常的种类 Exception.class表示处理除了下面两种异常的其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {

        return new Result(Code.BUSINESS_ERROR, null, "嘿嘿,异常就这啊！");
    }

    /**
     * 下面方法是当拦截到系统异常的时候进行处理
     */
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员

        return new Result(e.getCode(), null, e.getMessage());
    }

    /**
     * 下面方法是当拦截到业务异常的时候进行处理
     */
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {

        return new Result(e.getCode(), null, e.getMessage());
    }

}
