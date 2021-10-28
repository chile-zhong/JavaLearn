package com.lxg.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Servlet:
 * Servlet是运行在服务端的Java应用程序,由Servlet容器来管理
 * 当用户对容器法人送HTTP请求的尸首,容器将通知相应地Servlet对象进行响应,完成用户与程序见的jiaohu.
 */
public class Servlet1 implements Servlet {
    /**
     * Servlet实例化后,Servlet容器调用该方法来完成初始化工作
     * @param servletConfig
     * @throws ServletException
     */
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    /**
     * 用于会获取servlet对象的配置信息,返回ServletConfig对象
     * @return
     */
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 处理客户端的请求
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet service running...");
    }

    /**
     * 返回有关Servlet的信息,如作者\版本等
     * @return
     */
    public String getServletInfo() {
        return null;
    }

    /**
     * 当Servlet对象从容器中移除时,容器调用该方法,释放资源
     */
    public void destroy() {

    }
}
