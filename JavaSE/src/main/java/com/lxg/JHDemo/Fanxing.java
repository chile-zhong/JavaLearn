package com.lxg.JHDemo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author lxg
 * @description 泛型类
 * @date 2021/9/6
 *
 * 在定义类的时候，在类名的后面添加<E、K、V、A、B>等，起到占位的作用，类中的方法的返回值类型和属性都可以使用
 */
public class Fanxing<A> {
    private int id;
    private A a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void show(){
        System.out.println("id:"+id+"A:"+a);
    }

    //泛型作为返回值
    public A get(){
        return a;
    }

    //泛型作为参数
    public void set(A a){
        System.out.println("执行set方法"+a);
    }
}
