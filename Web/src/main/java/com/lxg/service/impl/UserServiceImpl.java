package main.java.com.lxg.service.impl;

import com.lxg.dao.UserDao;
import com.lxg.dao.impl.UserDaoImpl;
import com.lxg.entity.User;
import com.lxg.service.UserService;

/**
 * @author lxg
 * @description 用户接口实现类
 * @date 2021/9/11
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    public User checkUser(User user) {
        return  userDao.checkUser(user);
    }
}
