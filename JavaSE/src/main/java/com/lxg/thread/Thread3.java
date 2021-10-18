package com.lxg.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author lxg
 * @description 第三种创建线程的方式
 * @date 2021/9/14
 *
 * 第三种实现线程的方式：
 * 实现Callable接口
 */
public class Thread3 implements Callable<Integer> {

    /**
     * 1.实现Callable接口，可以不带泛型，如果不带，那么call方法的返回值类型就是object类型
     * 2.如果带泛型，call方法的返回值类型就是泛型类型
     * 3.从call方法看到：方法有返回值类型，并且可以抛出异常
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10); // 返回10以内的随机数
    }
}

class Test3{
    //main方法，程序的入口
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       //定义一个线程的对象
        Thread3  thread3 = new Thread3();
        FutureTask ft = new FutureTask(thread3);
        Thread t = new Thread(ft);
        t.start();

        //获取线程的返回值
        Object o = ft.get();
        System.out.println(o);
    }
}
