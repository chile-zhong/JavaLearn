package com.lxg.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lxg
 * @description Servlet的生命周期
 * @date 2021/10/18
 */
public class Servlet2 implements Servlet {

    /**
     * 初始化方法，在servlet被创建时执行，只会执行一次
     * Servlet什么时候被创建？
     *  * 默认情况下是，第一次被访问的时候创建，
     *  * 可以配置Servlet的创建时机，在web.xml中配置
     *servlet中的init方法只被执行一次，一个Servlet在内存中只有一个对象，Servlet是单例的
     *  * 多个用户同时访问时，可能存在线程安全问题
     *  * 解决：尽量不要在servlet中定义成员变量，即使定义的变量，也不要对其修改值
     *
     * @param servletConfig
     * @throws ServletException
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    /**
     * 获取ServletConfig对象
     * ServletConfig:Servlet的配置对象
     * @return
     */
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法，每一次Servlet被访问时就会执行，执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service...");

        /*ServletConfig servletConfig = getServletConfig();
        servletConfig.getInitParameter("init");//获取初始化参数值
        servletConfig.getInitParameterNames();//获取所有初始化参数名称
        servletConfig.getServletContext();//获取Servlet上下文对象
        servletConfig.getServletName();//获取Servlet对象的实例名*/
    }

    /**
     * 获取servlet的一些信息，版本、作者等
     * @return
     */
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在Servlet被正常关闭时执行，只执行一次，
     * * Servlet被销毁时执行，服务器关闭时，Servlet被销毁
     * * 只有服务器正常关闭时，才会执行destroy方法
     * * destroy方法在Servlet被销毁之前执行，一般用于释放资源
     */
    public void destroy() {
        System.out.println("destroy...");
    }
}
