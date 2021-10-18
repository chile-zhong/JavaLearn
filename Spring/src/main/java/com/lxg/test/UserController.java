package com.lxg.test;

import com.lxg.spring4.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lxg
 * @description 模拟web层测试
 * @date 2021/10/8
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext4.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
