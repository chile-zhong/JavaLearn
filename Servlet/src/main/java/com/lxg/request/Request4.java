package com.lxg.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lxg
 * @description 测试请求转发
 * @date 2021/10/18
 */
@WebServlet("/request4")
public class Request4 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("request4...");


        /**
         *
         */
        //存储数据到request域中
        req.setAttribute("msg","hello Servlet");

        /**
         * 转发到request5
         * * 通过request对象来获取请求转发器对象：RequestDispatcher getRequestDispatcher(String path)
         * * 使用RequestDispatcher对象来进行转发：forward(ServletHttpRequest request,ServletHttpQesponse response)
         *
         * 特点：
         * * 1.浏览器地址栏不发生变化
         * * 2.只能转发到当前服务器的内部资源中
         * * 3.转发是一次请求
         * /
        /*RequestDispatcher requestDispatcher = req.getRequestDispatcher("/request5");
        requestDispatcher.forward(req,resp);*/

        req.getRequestDispatcher("/request5").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
