package com.lxg.annocation.service.impl;

import com.lxg.annocation.dao.UserDao;
import com.lxg.annocation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author lxg
 * @description 实现类
 * @date 2021/10/8
 */

/**
 * <bean id="userService" class="com.lxg.annocation.service.impl.UserServiceImpl">
 *         <property name="userDao" ref="userDao"></property>
 *     </bean>
 *
 * 使用注解代替xml文件中的配置
 */
//@Component("userService")
@Service("userService")
@Scope("singoleton")
public class UserServiceImpl implements UserService {
    /**
     * 普通属性注入测试
     */
    //@Value("com.mysql.cj.jdbc.Driver")
    @Value("${jdbc.driver}")
    private String driver;

    /**
     * <property name="userDao" ref="userDao"></property>
     * 使用注解代替属性注入
     */
    //@Autowired //如果单独使用，按照数据类型从Spring容器中进行匹配的
    //@Qualifier("userDao") //是按照id的值从容器中进行匹配的，但是此处需要结合@Autowired使用
    /**
     * 此处的Resource相当于@Autowired+@Qualifier
     */
    @Resource(name = "userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    /**
     * 使用注解标明初始化方法
     */
    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    /**
     * 使用注解标明销毁方法
     */
    @PreDestroy
    public void destory(){
        System.out.println("destory...");
    }
}
