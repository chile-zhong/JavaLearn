package com.lxg.enums;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/9/23
 */
public class Test5 {

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(19);
        p.setName("lili");
        p.setSex(Gender.男);//传入枚举类Gender的对象：-->在入口处对参数进行了限制
        System.out.println(p);
    }
}
