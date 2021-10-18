package com.lxg.thread.demo;

/**
 * @author lxg
 * @description 生产者消费者问题-商品类
 * @date 2021/9/16
 */
public class Product {
    //品牌
    private String brand;
    //名字
    private String name;

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
}
