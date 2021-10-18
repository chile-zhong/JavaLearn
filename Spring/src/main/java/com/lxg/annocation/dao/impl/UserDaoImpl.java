package com.lxg.annocation.dao.impl;

import com.lxg.annocation.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author lxg
 * @description 实现类
 * @date 2021/10/8
 */
//    <bean id="userDao" class="com.lxg.annocation.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")可以使用@Repository("userDao")替代，代表Dao层，效果一样
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save...");
    }
}
