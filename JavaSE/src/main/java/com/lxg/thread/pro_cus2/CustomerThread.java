package com.lxg.thread.pro_cus2;

/**
 * @author lxg
 * @description 消费者线程
 * @date 2021/9/16
 */
public class CustomerThread extends Thread{

    private Product p;

    public CustomerThread(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            /*synchronized (p){
                System.out.println("消费者消费了"+p.getBrand()+"---"+p.getName());
            }*/
            p.getProduct();
        }
    }
}
