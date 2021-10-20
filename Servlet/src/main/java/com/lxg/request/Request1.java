package com.lxg.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author lxg
 * @description request对象演示
 * @date 2021/10/18
 */
@WebServlet("/request1")
public class Request1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //演示request对象的方法

        //获取请求消息数据

        //1.获取请求行数据
        String method = req.getMethod();//获取请求行
        String contextPath = req.getContextPath();//获取虚拟路径
        String servletPath = req.getServletPath();//获取servlet路径
        String queryString = req.getQueryString();//获取get方式请求参数
        String requestURI = req.getRequestURI();//获取请求的URI
        StringBuffer requestURL = req.getRequestURL();//获取URL
        String protocol = req.getProtocol();//获取协议
        System.out.println(method);
        System.out.println(contextPath);
        System.out.println(servletPath);
        System.out.println(queryString);
        System.out.println(requestURI);
        System.out.println(requestURL);
        System.out.println(protocol);
        System.out.println("-------------------------------");
        
        //2.获取请求头数据
        Enumeration<String> headerNames = req.getHeaderNames();//获取所有请求头的名称
        while(headerNames.hasMoreElements()){
            String header = req.getHeader(headerNames.nextElement());
            System.out.println(header);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
