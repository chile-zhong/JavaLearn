package com.lxg.innerdemo;

/**
 * @author lxg
 * @description 方法内部类
 * @date 2021/9/3
 */
public class MethodInnerClass {

    public void show(){
        System.out.println("i am method");

        class MethodClass{
            public void test(){
                System.out.println("i am MethodInnerClass");
            }
        }

        MethodClass methodClass = new MethodClass();
        methodClass.test();
    }
}
