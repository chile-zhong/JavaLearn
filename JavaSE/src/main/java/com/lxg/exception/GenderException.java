package com.lxg.exception;

import java.sql.SQLOutput;

/**
 * @author lxg
 * @description 自定义异常类
 * @date 2021/9/4
 *
 * 自定义异常：
 *     在Java的api中，提供了非常丰富的异常类，但是在某些情况下不太满足需求，此时需要自定义异常
 *     步骤：
 *       1.继承 Exception类
 *       2.自定义实现构造方法
 *       3.需要使用的时候，使用throw new 自定义异常的名称；
 *      什么时候需要自定义异常？
 *         一般情况下不需要
 *         但是在公司要求明确，或者要求异常格式规范同一的时候，需要自己实现。
 *
 */
public class GenderException extends Exception{

    public GenderException(){
        System.out.println("性别异常");
    }

    public GenderException(String message){
        System.out.println(message);
    }
}
