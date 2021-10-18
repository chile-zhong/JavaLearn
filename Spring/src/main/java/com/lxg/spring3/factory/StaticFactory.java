package com.lxg.spring3.factory;

import com.lxg.spring3.dao.UserDao;
import com.lxg.spring3.dao.impl.UserDaoImpl;

/**
 * @author lxg
 * @description 静态工厂方法实例化
 * @date 2021/10/8
 */
public class StaticFactory {

    /**
     * 定义静态方法，实例化JavaBean
     * @return
     */
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
