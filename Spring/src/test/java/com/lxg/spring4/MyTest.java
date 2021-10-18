package com.lxg.spring4;

import com.lxg.spring4.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lxg
 * @description 测试依赖注入
 * @date 2021/10/8
 */
public class MyTest {

    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext4.xml");
        UserDao userDao = (UserDao) app.getBean("userDao2");
        userDao.save();
    }
}
