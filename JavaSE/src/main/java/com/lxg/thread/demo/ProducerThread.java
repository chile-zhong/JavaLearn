package com.lxg.thread.demo;

/**
 * @author lxg
 * @description 生产者线程
 * @date 2021/9/16
 */
public class ProducerThread extends Thread{
    //共享商品
    private Product p;

    public ProducerThread(Product p){
        this.p = p;
    }
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            /*if(i % 2 == 0){
                p.setBrand("费列罗");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p.setName("巧克力");
            }else{
                p.setBrand("哈尔滨");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p.setName("啤酒");
            }
            //将生产者信息打印
            System.out.println("生产者生产了"+p.getBrand()+"----"+p.getName());*/

            synchronized(p){
                if(i % 2 == 0){
                    p.setBrand("费列罗");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("巧克力");
                }else{
                    p.setBrand("哈尔滨");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("啤酒");
                }
                //将生产者信息打印
                System.out.println("生产者生产了"+p.getBrand()+"----"+p.getName());
            }
        }
    }
}
