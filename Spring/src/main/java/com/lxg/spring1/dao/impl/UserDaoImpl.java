package com.lxg.spring1.dao.impl;


import com.lxg.spring1.dao.UserDao;

/**
 * @author lxg
 * @description 实现类
 * @date 2021/9/24
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl被创建了");
    }

    public void init(){
        System.out.println("初始化方法...");
    }

    public void destory(){
        System.out.println("销毁方法...");
    }

    public void save() {
        System.out.println("save running...");
    }
}
