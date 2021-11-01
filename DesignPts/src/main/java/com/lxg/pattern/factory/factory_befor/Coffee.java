package com.lxg.pattern.factory.factory_befor;

/**
 * 咖啡类
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSugar(){
        System.out.println("加糖");
    }
    public void addMilk(){
        System.out.println("加奶");
    }
}