package com.lxg.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/**
 * @author lxg
 * @description 获取请求参数
 * @date 2021/10/18
 */
@WebServlet("/request3")
public class Request3 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("utf-8");

        //获取请求参数
        String name = req.getParameter("username");//根据参数名称获取参数值
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");//根据参数名称获取参数值的数组，如获取多选框的值
        Enumeration<String> names = req.getParameterNames();//获取所有请求的参数名称
        Map<String, String[]> map = req.getParameterMap();//获取所有参数的map集合
        System.out.println(name+","+password);
        System.out.println("hobbies:");
        for (String hobby:hobbies) {
            System.out.print(hobby+" ");
        }
        while(names.hasMoreElements()){
            System.out.println(names.nextElement());
        }
        for (String[] s:map.values()) {
            System.out.println(s);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
