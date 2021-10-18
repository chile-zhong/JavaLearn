package com.lxg.thread.pro_cus2;

/**
 * @author lxg
 * @description 生产者消费者问题测试类
 * @date 2021/9/16
 */
public class Test {
    public static void main(String[] args) {
        //共享商品
        Product p = new Product();

        //创建生产者消费者线程
        ProducerThread producer = new ProducerThread(p);
        CustomerThread customer = new CustomerThread(p);

        producer.start();
        customer.start();


    }
}
