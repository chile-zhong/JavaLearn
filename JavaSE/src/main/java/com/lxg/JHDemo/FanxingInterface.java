package com.lxg.JHDemo;

public interface FanxingInterface<B> {

    //泛型作为方法返回值
    public B test();

    //泛型作为方法参数
    public void test2(B b);
}
