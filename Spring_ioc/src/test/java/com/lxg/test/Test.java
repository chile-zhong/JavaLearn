package com.lxg.test;

import com.lxg.dao.TestDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Test {


    @org.junit.Test
    public void testDao(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao test = (TestDao) app.getBean("test");
        test.sayHello();
        /*FileSystemXmlApplicationContext:
        ClassPathXmlApplicationContext:
        XmlWebApplicationContext:*/
    }
}
