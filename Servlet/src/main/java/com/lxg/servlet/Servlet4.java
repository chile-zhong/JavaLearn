package com.lxg.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author lxg
 * @description Servlet集成GenericServlet抽象类
 * @date 2021/10/18
 *
 * GenericServlet实现了Servlet接口，将接口中的其他方法都做了默认实现，只是将service()方法作为抽象方法
 * 如果通过集成GenericServlet来实现Serlvet类，只需要重写service方法即可，其他的方法，根据需要来选择是否重写
 */
@WebServlet("/servlet4")
public class Servlet4 extends GenericServlet {

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet4...");
    }
}
