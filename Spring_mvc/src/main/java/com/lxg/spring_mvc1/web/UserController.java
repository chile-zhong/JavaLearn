package com.lxg.spring_mvc1.web;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.lxg.spring_mvc1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lxg
 * @description 模拟web端
 * @date 2021/10/10
 */
public class UserController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 获取Spring容器中的Bean
         */
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //配置了监听器后,用下面代码取代
        /*ApplicationContext app = (ApplicationContext) req.getServletContext().getAttribute("app");
        UserService userService = app.getBean(UserService.class);
        userService.save();*/

        //或者使用这种方法啊来获取
        ServletContext servletContext = this.getServletContext();
        //ApplicationContext app1 = WebApplicationContextUtils.getApplicationContext(servletContext);
        //ApplicationContext app1 = (ApplicationContext) servletContext.getAttribute("app");
        //UserService userService1 = app1.getBean(UserService.class);
        //userService1.save();

        /**
         * 使用Spring提供的：WebApplicationContextUtils
         */
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
