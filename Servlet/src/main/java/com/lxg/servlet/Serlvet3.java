package com.lxg.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lxg
 * @description Servlet注解配置
 * @date 2021/10/18
 */
@WebServlet("/servlet3")
public class Serlvet3 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        /*req.getContextPath(); //获取请求的上下文路径,以"/"开头
        req.getCookies();//获取请求中发送的所有cookie对象,返回cookie的数组
        req.getMethod();//获取请求的方式
        req.getQueryString();//获取请求参数中的字符串形式
        req.getRequestURI();//获取URI
        req.getServletPath();//获取URI中的Servlet路径
        req.getSession();//获取与请求关联的HttpSession对象*/

        /*//向客户端写入Cookie
        resp.addCookie(new Cookie("hh","test"));
        //发送一个错误代码响应到客户端
        resp.sendError(404);
        //发送错误代码到客户端,以及错误信息
        resp.sendError(404,"msg");
        //重定向到location指向的资源
        resp.sendRedirect("/location");*/


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
