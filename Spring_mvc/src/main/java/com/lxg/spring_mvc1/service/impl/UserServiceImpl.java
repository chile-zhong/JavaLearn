package com.lxg.spring_mvc1.service.impl;

import com.lxg.spring_mvc1.dao.UserDao;
import com.lxg.spring_mvc1.service.UserService;

/**
 * @author lxg
 * @description 实现Servi层接口
 * @date 2021/10/10
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
