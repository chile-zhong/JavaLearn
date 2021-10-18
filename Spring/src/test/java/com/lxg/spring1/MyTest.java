package com.lxg.spring1;

import com.lxg.spring1.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/10/8
 */
public class MyTest {

    @Test
    public void testUserDao(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext1.xml");
        UserDao userDao = (UserDao)app.getBean("userDao");
        userDao.save();
    }
}
