package com.lxg.spring3;

import com.lxg.spring3.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/10/8
 */
public class Mytest {

    @Test
    public void testUserDao(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        System.out.println(userDao);
        app.close();
    }

    @Test
    public void testStaticFactory(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Object userDao = app.getBean("userDao");
        System.out.println(userDao);
    }
}
