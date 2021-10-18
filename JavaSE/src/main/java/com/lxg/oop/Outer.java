package com.lxg.oop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lxg
 * @description 内部类演示例子
 * @date 2021/7/19
 */
public class Outer { //外部类

    class Inner{ //内部类
        public void print(){
            System.out.println("hello world");
        }
    }

    public void show(){ //外部类方法
        new Inner().print(); //调用内部类的成员方法
    }

    public void function(){
        //定义方法内部类
        class Inner1{
            public void show(){
                System.out.println("我是方法内部类的方法");
            }
        }
        //在外部类的方法中使用方法内部类
        new Inner1().show();  //可以使用
    }
}
