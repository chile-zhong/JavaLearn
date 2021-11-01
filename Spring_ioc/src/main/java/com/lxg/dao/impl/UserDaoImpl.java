package com.lxg.dao.impl;

import com.lxg.dao.UserDao;
import com.lxg.model.User;

public class UserDaoImpl implements UserDao {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void login() {
        System.out.println("userDao login");
        System.out.println(user.getName()+"login");
        System.out.println("欢迎"+user.getName());
        System.out.println(user);
    }
}
