package com.lxg.service.impl;

import com.lxg.dao.UserDao;
import com.lxg.service.UserService;

public class UserServiceImpl implements UserService {
    //声明UserDao属性
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    //添加属性的setter方法，用于实现依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void login() {
        userDao.login();
        System.out.println("userService login");
    }
}
