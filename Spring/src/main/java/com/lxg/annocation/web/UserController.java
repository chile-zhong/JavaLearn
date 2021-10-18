package com.lxg.annocation.web;

import com.lxg.annocation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lxg
 * @description 模拟客户端测试类
 * @date 2021/10/8
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("application_annotation.xml");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
