package com.lxg.JHDemo;

/**
 * @author lxg
 * @description 泛型方法
 * @date 2021/9/6
 */
public class FanxingMethod <T>{

    private T t;

    public <Q> void show(Q q){
        System.out.println(t);
        //System.out.println(q);
    }
}
