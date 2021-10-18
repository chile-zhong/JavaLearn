package com.lxg.spring4.service.impl;


import com.lxg.spring4.dao.UserDao;
import com.lxg.spring4.dao.impl.UserDaoImpl;
import com.lxg.spring4.service.UserService;

/**
 * @author lxg
 * @description 业务层实现
 * @date 2021/10/8
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {

        userDao.save();
    }
}
