package com.lxg.travel.service.impl;

import com.lxg.travel.dao.UserDao;
import com.lxg.travel.dao.impl.UserDaoImpl;
import com.lxg.travel.domain.User;
import com.lxg.travel.service.UserService;

/**
 * @author lxg
 * @description 用户注册
 * @date 2021/10/20
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean regist(User user) {
        String name = user.getName();
        User u = userDao.findByUserName(name);
        if(u!=null){
            //用户已经存在
            return  false;
        }
        //保存用户信息
        userDao.save(user);
        return true;
    }
}
