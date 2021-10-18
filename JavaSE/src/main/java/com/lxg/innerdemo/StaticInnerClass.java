package com.lxg.innerdemo;

/**
 * @author lxg
 * @description 静态内部类
 * @date 2021/9/3
 */
public class StaticInnerClass {

    private int id;

    public void test(){
        System.out.println("static Inner class test");
    }

    /*定义静态内部类*/
    static class StaticInnerClassT{
        private String name;
        public void show(){
            System.out.println("i am static inner class");
        }
    }
}
