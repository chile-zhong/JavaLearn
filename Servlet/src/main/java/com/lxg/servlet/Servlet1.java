package com.lxg.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lxg
 * @description 第一个servlet
 * @date 2021/10/18
 */
public class Servlet1 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet service running...");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
