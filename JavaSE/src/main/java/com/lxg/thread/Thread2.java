package com.lxg.thread;

/**
 * @author lxg
 * @description 实现多线程的第二种方式演示
 * @date 2021/9/14
 *
 * 实现多线程的第二种方式是实现Runnable接口
 */
public class Thread2 implements Runnable{

    /**
     * 重写run方法，实现子线程的业务逻辑代码
     */
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}

class Test2{
    public static void main(String[] args) {
        //定义子线程对象
        Thread2 thread2 = new Thread2();  //定义实现Runnable接口的子线程对象
        Thread t = new Thread(thread2,"子线程"); //定义Thread类对象，并将子线程对象作为参数传递
        t.start();//调用start 方法，启动线程

        /**
         * 主线程
         */
        Thread.currentThread().setName("主线程");
        for (int i = 1; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }

    }
}


