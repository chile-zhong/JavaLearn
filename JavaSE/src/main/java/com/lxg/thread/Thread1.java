package com.lxg.thread;

/**
 * @author lxg
 * @description 第一种创建线程的方式演示类
 * @date 2021/9/13
 *
 * 第一种创建建线程的方式：继承Thread类
 */
public class Thread1 extends Thread{

    /**
     * 通过构造器给线程设置名称
     */
    public Thread1(String name){
        //调用父类的有产构造器
        super(name);
    }

    /**
     * 一会儿线程对象就要开始争抢资源了，这个线程要执行的任务到底是啥，这个任务要放到方法中，但是这个方法不能随便写，
     * 必须重写Thread类run方法，然后线程的任务/逻辑写在run方法中
     */
    @Override
    public void run() {
        //输出1-10
        for (int i = 1; i <=100; i++) {
            //System.out.println("thread---"+i);

            //通过getName来获取线程名称
            System.out.println(getName()+i);
        }
    }
}

class Test1{
    public static void main(String[] args) {
        /**
         * 给主线程设置名称
         * Thread.currentThread():获取当前执行的线程
         */
        Thread.currentThread().setName("主线程");

        //主线程也要输出1-10
        for (int i = 1; i <=100 ; i++) {
            //System.out.println("main1"+i);

            //获取当前线程名称
            System.out.println(Thread.currentThread().getName()+"1---"+i);
        }
        //开始制造其他他线程，要跟主线程争抢资源
        //具体的线程对象
        //Thread1 thread1 = new Thread1();
        Thread1 thread1 = new Thread1("子线程");

        //设置线程名字
        //thread1.setName("子线程");


        /**
         * 调用run方法，执行子线程中的任务,得出的结果跟代码顺序是一一至的，并没有展现出多线程的效果
         * 因为run方法不能直接被调用，直接调用会被当作普通的方法
         *
         */
        //thread1.run();

        /**
         * 想要子线程真正的起作用，需要执行start方法
         * start方法是thread中的方法
         */
        thread1.start();



        //主线程也要输出1-10
        for (int i = 1; i <=100 ; i++) {
            //System.out.println("main2"+i);

            System.out.println(Thread.currentThread().getName()+"2----"+i);
        }

    }
}
