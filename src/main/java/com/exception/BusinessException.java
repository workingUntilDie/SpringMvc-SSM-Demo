package com.exception;

/**
 * 该类是对业务异常做出处理
 */

//RuntimeException是表示运行时异常，可以出现以后不处理，自动向上抛出
public class BusinessException extends RuntimeException{

    //异常编号
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
