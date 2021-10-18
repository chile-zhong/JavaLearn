package com.lxg.spring3.factory;

import com.lxg.spring3.dao.UserDao;
import com.lxg.spring3.dao.impl.UserDaoImpl;

/**
 * @author lxg
 * @description 工厂实例方法实例
 * @date 2021/10/8
 */
public class DynamicFactory {

    public static UserDao getUserDao(){

        return new UserDaoImpl();
    }
}
