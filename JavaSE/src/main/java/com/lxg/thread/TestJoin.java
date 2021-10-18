package com.lxg.thread;

/**
 * @author lxg
 * @description 测试join方法
 * @date 2021/9/14
 * Join()方法：当一个线程调用了join方法，这个线程就会先被执行，它执行结束后才能去执行其他的线程
 `*     注意：必须先start，再join才有效
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <=100 ; i++) {
            System.out.println("main---"+i);
            if(i==6){
                /**
                 * 定义线程对象，调用join方法，优先执行线程
                 */
                T t = new T();
                t.setName("子线程");
                t.start();
                t.join();
            }
        }
    }
}

/**
 * 定义线程
 */
class T extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(getName()+"---"+i);
        }
    }
}