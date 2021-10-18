package main.java.com.lxg.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lxg
 * @description servlet演示
 * @date 2021/9/8
 *
 * Servlet简介：
 *  - 是一种Web服务端编程技术
 *  - 是实现了特殊接口的Java类
 *  - 由支持Servlet的Web服务调用和启动运行
 *  - 一个Servlet负责对应的一个或一组URL访问请求，并返回相应的响应内容
 *
 *  实现使用：
 *    - 创建一个普通Java文件
 *    - Java文件实现HttpServlet
 *    - 重写Service的方法
 *    - 在WEB-INF的web.xml中添加请求与servlet类的映射关系
 *
 *  servlet的访问流程：
 *    - 浏览器发送请求到服务器，服务器根据请求的URL地址中的URL信息在webapps目录下找到对应的项目文件，然后在web.xml中
 *      检索对应的servlet，然后调用执行servlet
 *
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("my web project");
        System.out.println("my web project");
    }
}
