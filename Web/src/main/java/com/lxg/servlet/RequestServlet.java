package main.java.com.lxg.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * HttpServletRequest用来存放客户端请求的参数
 * 请求行：
 * 请求头：
 * 请求体：
 */
public class RequestServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost");
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");


        /**
         * 获取请求行参数
         */
        //获取请求方法
        String method = request.getMethod();
        System.out.println(method);

        //获取请求的完整路径
        StringBuffer url = request.getRequestURL();
        System.out.println(url);

        //获取请求中的资源路径
        String uri  = request.getRequestURI();
        System.out.println(uri);

        //获取请求中的协议
        String scheme = request.getScheme();
        System.out.println(scheme);

        /**
         * 获取请求头参数
         */
        //根据key获取value值
        String userAgent = request.getHeader("User-Agent");
        System.out.println(userAgent);

        Enumeration<String> keys = request.getHeaderNames();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            String value = request.getHeader(key);
            System.out.println(key+":"+value);
        }
        /**
         * 获取请求体参数
         */
        //获取用户请求数据
        //无论请求方式是post还是get，获取用户数据的方式不变
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        System.out.println(name+":"+pwd);

        //获取用户数据中所有的key
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            System.out.println(parameterNames.nextElement());
        }

        //获取相同key的多个数据值，例如checkBox
        String[] parameterValues = request.getParameterValues("fav");
        for (String str:parameterValues) {
            System.out.println("fav"+str);
        }

        /**
         * request常用方法
         */
        request.getRequestURL();
        request.getRequestURI();
        request.getQueryString();
        request.getMethod();
        request.getScheme();
        String remoteAddress = request.getRemoteAddr();
        String remoteUser = request.getRemoteUser();
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();
    }
}
