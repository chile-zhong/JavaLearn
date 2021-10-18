package com.lxg.thread;

/**
 * @author lxg
 * @description 测试设置伴随线程方法setDaemon
 * @date 2021/9/14
 *
 * 将子线程设置为主线程的伴随线程，主线程停止的时候，子线程也不要继续执行了
 */
public class TestAetDaemon {
    public static void main(String[] args) {
        //定义线程对象
        TT t = new TT();
        //设置伴随线程, 注意：先设置，再启动
        t.setDaemon(true);
        //启动线程
        t.start();

        //主线程程序
        for (int i = 1; i <=10 ; i++) {
            System.out.println("主程序---"+i);
        }
    }
}

class TT extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=1000 ; i++) {
            System.out.println("子线程---"+i);
        }
    }
}