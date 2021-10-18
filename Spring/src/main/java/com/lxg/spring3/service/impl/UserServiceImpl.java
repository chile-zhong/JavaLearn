package com.lxg.spring3.service.impl;

import com.lxg.spring3.dao.UserDao;
import com.lxg.spring3.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lxg
 * @description 业务层实现
 * @date 2021/10/8
 */
public class UserServiceImpl implements UserService {

    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserDao userDao =(UserDao) app.getBean("userDao");
        userDao.save();
    }
}
