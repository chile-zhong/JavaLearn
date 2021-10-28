package com.lxg.singleton;

import jdk.nashorn.internal.ir.IdentNode;

/**
 * @author lxg
 * @description 懒汉式 lazy loading 懒加载
 * 什么时候需要使用，据什么时候初始化实例
 * 缺点：
 * 虽然达到了按需初始化的目的，但是带来了线程不安全的问题
 * @date 2021/10/28
 */
public class Mgr02 {

    private static  Mgr02 INSTANCE;

    //私有化构造器,避免通过new方法实例化对象。
    private Mgr02(){

    }

    public static Mgr02 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }

    public void method(){
        System.out.println("懒汉式方法。。。");
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(Mgr02.getInstance().hashCode());
                }
            }
            ).start();
        }
    }
}
