package com.lxg.spring2;

import com.lxg.spring2.dao.UserDao;
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
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserDao userDao1 = (UserDao)app.getBean("userDao");
        UserDao userDao2 = (UserDao)app.getBean("userDao");

        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
