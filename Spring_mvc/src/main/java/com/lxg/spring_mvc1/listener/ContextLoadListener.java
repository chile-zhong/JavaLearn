package com.lxg.spring_mvc1.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author lxg
 * @description 创建监听器来监听web程序启动时创建ApplicationContext对象，
 * 就不用在每个Servlet中都编写代码来获取Application Context对象了，创建好的对
 * 象放在Context域中，在其他任何地方都可以获取
 * @date 2021/10/10
 */
public class ContextLoadListener implements ServletContextListener {
    /**
     * 上下文初始化方法
     * @param servletContextEvent
     */
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //读取web.xml中的全局参数
        ServletContext servletContext = servletContextEvent.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app",app);
        System.out.println("Spring容器创建完毕...");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
