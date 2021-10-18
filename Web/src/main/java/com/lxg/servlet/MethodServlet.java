package main.java.com.lxg.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * servlet中可以有service方法，用来接收get或者post请求
 *    如果Service和doGet或者doPost同时存在，那么会默认调用service方法
 *    如果同时有service、doPost、doGet方法,在service方法的实现中调用了super.service()会根据请求的方式跳转到doGet或者doPost
 *
 * doGet方法用来接收get请求
 * doPost方法用来请求post请求
 *
 * 总结：
 *   编写servlet类的时候，不需要重写service方法，只需要重写doPost或者doGet方法即可
 *
 * Servlet常见错误：
 *   404：访问资源不存在
 *       - 请求路径跟web.xml中填写的不一致
 *       - 请求路径的项目虚拟名称填写错误
 *   405：
 *      - 请求的方式跟servlet中支持的方式不一致
 *
 *   500：服务器内部错误
 *      - web.xml中servlet类的名称错误
 *      - Servlet对应的处理方法中存在代码逻辑错误
 */
public class MethodServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("我是Service");
    }
}
