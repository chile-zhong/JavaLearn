package com.lxg.innerdemo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lxg
 * @description 内部类this使用测试
 * @date 2021/9/3
 */
public class Outer {

    private String name = "zhangsan";

    /*定义内部类*/
    public class Inner{

        private String name = "lisi";  //与外部类同名的内部类私有属性

        public void show(){

            System.out.println(name);
            System.out.println(this.name);
            //使用外部类的属性,使用this关键字
            System.out.println(Outer.this.name);
        }

        /*内部类中定义内部类
        * 可以定义内部类的内部类
        * 但是一般没有意义
        * */
        class InnerInner{

            private String name = "Inner Inner";

            public void show(){
                System.out.println("Inner Inner");
            }
        }
    }
}
