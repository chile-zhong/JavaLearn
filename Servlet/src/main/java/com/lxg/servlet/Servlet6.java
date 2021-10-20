package com.lxg.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lxg
 * @description 获取表单数据
 * @date 2021/10/18
 *
 * urlParten:servlet访问路径
 *   1.一个Servlet可以定义多个访问路径
 *   2.路径定义规则
 *     /XXX
 *     /XXX/XXX:多层路径，目录结构
 *     *.do
 */
@WebServlet("/servlet6")
public class Servlet6 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");

        System.out.println(name+","+pwd);

        resp.getWriter().print(name+","+pwd);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
