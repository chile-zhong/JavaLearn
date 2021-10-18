package com.lxg.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lxg
 * @description 秒表小例子演示sleep方法
 * @date 2021/9/14
 */
public class TestSleep2 {
    public static void main(String[] args) throws InterruptedException {
        //定义时间格式

        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        while(true){
            //获取当前时间
            Thread.sleep(1000);
            Date d = new Date();
            System.out.println(format.format(d));
        }
    }
}
