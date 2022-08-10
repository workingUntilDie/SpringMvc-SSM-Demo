package com.controller;

/**
 * 该类是定义Result类中Code属性的具体值
 */
public class Code {
    
    //代表增加成功
    public static final Integer SAVE_OK = 20011;
    //代表删除成功
    public static final Integer DELETE_OK = 20021;
    //代表修改成功
    public static final Integer UPDATE_OK = 20031;
    //代表查询成功
    public static final Integer GET_OK = 20041;
    
    //代表增加失败
    public static final Integer SAVE_ERROR = 20010;
    //代表删除失败
    public static final Integer DELETE_ERROR = 20020;
    //代表修改失败
    public static final Integer UPDATE_ERROR = 20030;
    //代表查询失败
    public static final Integer GET_ERROR = 20040;

    //代表系统异常
    public static final Integer SYSTEM_ERROR = 50001;
    //代表业务异常
    public static final Integer BUSINESS_ERROR = 50002;
    //代表系统未知异常
    public static final Integer SYSTEM_UNKNOWN_ERROR = 59999;

}
