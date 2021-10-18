package com.lxg.thread;

/**
 * @author lxg
 * @description 测试Sleep方法
 * @date 2021/9/14
 * sleep方法，是线程进入阻塞状态等待设定的时间
 */
public class TestSleep {
    public static void main(String[] args) {
        try {
            Thread.sleep(3000);//程序进入阻塞状态3秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main");
    }
}
