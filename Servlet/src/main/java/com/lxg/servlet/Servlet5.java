package com.lxg.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HttpServlet:
 * HttpServlet继承了GenericServlet类,通过其对GenericServlet类的扩展,可以很方便的对HTTP
 * 请求进行处理及响应.
 *
 */
@WebServlet("/servlet5")
public class Servlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("get method invoke");
        PrintWriter out=resp.getWriter();
        out.print("hello get method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("post method invoke");
        PrintWriter out=resp.getWriter();
        out.print("hi post method");
    }
}
