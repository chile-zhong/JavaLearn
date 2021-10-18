package com.lxg.annotation;

import java.lang.annotation.Documented;

/**
 * @author lxg
 * @description 演示内置注解
 * @date 2021/9/24
 */

@SuppressWarnings("all")
public class AnnoDemo2 {

    /**
     * @Override注解
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @Deprecated注解
     * 标识已过时的
     */
    @Deprecated
    public void show(){
        System.out.println("有缺陷,弃用");
    }


    public void show2(){

    }

    public void test(){
        show();
    }
}
