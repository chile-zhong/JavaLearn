package com.lxg.thread.pro_cus2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lxg
 * @description 生产者消费者问题-商品类
 * @date 2021/9/16
 *
 * 在Java对象中，有两种池
 * 锁池      synchronized
 * 等待池    wait(),notify(),notifyAll()
 * 如果一个线程调用了某个对象的wait()方法，那么该线程进入到该对象的等待池中（并且已经将锁释放）
 * 如果未来的某一时刻，另外一个线程调用了相同对象的notify方法，或者notifyAll方法，那么该等待池中的等待对象就会被唤醒
 * 然后进入该对象的锁池里面去获得该对象的锁，如果获得成功，那么该方法就会沿着wait方法之后的代码继续执行，注意是沿着wait方法之后
 *
 * 注意：
 * wait方法和notify方法必须放在同步方法或者同步代码块中才能生效，因为是在同步的基础上在线程间通信才会有效
 *
 * sleep和wait的区别：
 * sleep:进入阻塞状态没有释放锁
 * wait:进入阻塞状态释放了锁
 */
public class Product {
    //品牌
    private String brand;
    //名字
    private String name;

    //声明一个lock锁
    Lock lock  = new ReentrantLock();

    Condition producerCondition = lock.newCondition();
    Condition consumerCondition = lock.newCondition();



    //生否生产商品标志
    Boolean flag = false;//默认情况下没有商品，让生产者先生产，消费者再消费


    //getter&setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 生产商品
     * @param brand
     * @param name
     */
    public  void setProduct(String brand,String name){
        lock.lock();
        try {
            if(flag==true){
                try {
                    producerCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.setBrand(brand);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("生产者生产了"+this.getBrand()+"----"+this.getName());

            //生产者生产了商品
            flag = true;

            //唤醒消费者线程来消费
            // notify();
            consumerCondition.signal();
        }finally {
            lock.unlock();
        }

    }

    public void getProduct(){
        lock.lock();
        try {
            if(flag==false){//没有商品，等待生产者生产
                try {
                    //wait();
                    consumerCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者消费了"+this.getBrand()+"---"+this.getName());

            //消费过后
            flag = false;
            //唤醒生产者线程生产商品
            //notify();
            producerCondition.signal();
        }finally {
            lock.unlock();
        }
    }
}
