package com.lxg.innerdemo;

/**
 * @author lxg
 * @description 匿名内部类例子
 * @date 2021/9/3
 */
public class NONameInnerClass {

    public static void main(String[] args) {
        //定义使用匿名内部类
        /*
        *  此处代码等价与
        * Run run = new Run();
        * new Thread(run);
        * */
        new Thread(new Runnable(){

            public void run() {

            }
        });
    }
}

