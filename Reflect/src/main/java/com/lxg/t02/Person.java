package com.lxg.t02;

import java.io.Serializable;

/**
 * @author lxg
 * @description 人
 * @date 2021/9/21
 */
public class Person implements Serializable {

    //属性
    private int age;
    public String name;

    //方法
    private void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
