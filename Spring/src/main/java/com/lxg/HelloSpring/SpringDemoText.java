package com.lxg.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoText {
    public static void main(String[] args) {

        //ApplicationContext:表示ioc容器
        //ClassPathXmlApplicationContext:表示从当前classpath路径中获取xml文件的配置
        //根据spring的配置文件来获取ioc容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");

        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);

    }
}
