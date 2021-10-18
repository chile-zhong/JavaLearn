package main.java.com.lxg.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 直接创建Servlet，不需要在Web.xml中进行配置
 * 生命周期：
 *  从第一次接收请求被创建开始到服务器关闭之后销毁
 */
@WebServlet(name = "ServletLife")
public class ServletLife extends HttpServlet {

    /**
     * 完成Serlvet对象的初始化
     * 在Servlet接收到第一次请求的时候创建对象，只执行一次
     * 当配置了<load-on-startup> 时，在开启服务器时就开始创建Servlet了
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Servlet 生命周期");
        System.out.println("servlet生命周期");
    }

    /**
     * 服务器关闭的时候执行，销毁Servlet
     */
    @Override
    public void destroy() {
        System.out.println("销毁Servlet");
    }
}
