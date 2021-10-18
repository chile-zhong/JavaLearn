package com.lxg.thread;

/**
 * @author lxg
 * @description 测试线程的优先级
 * @date 2021/9/14
 */
public class TestPrority {
    //main方法，程序入口
    public static void main(String[] args) {

        /**
         * 定义两个子线程对象
         */
        T1 t1 = new T1("子线程1");
        //设置线程优先级
        t1.setPriority(10);//10的优先级最高
        t1.start();

        T2 t2 = new T2();
        t2.setName("子线程2");
        //设置线程优先级t
        t2.setPriority(1);//1的优先级最低
        t2.start();

        /**
         * 主线程逻辑
         */
        for (int i = 1; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}

/**
 * 定义线程1
 */
class T1 extends Thread{

    /**
     * 定义构造函数，用于给线程使用构造方法命名
     * @param name
     */
    public T1(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}

class T2 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <=100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}























































































































































