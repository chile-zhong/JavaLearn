package main.java.com.lxg.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * response表示服务端返回数据的响应对象
 * 响应头：
 * 相应行：
 * 响应体：
 */
public class ResponseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 响应头
         */
        //设置响应头，使用key-value的形式来设置，如果存在相同的key会把value的值覆盖
        response.setHeader("name","zhangsa");
        response.setHeader("name","lisi");
        //增加响应头，使用key-value的形式来设置，如果存在相同的key值，valuse值不会被覆盖
        response.addHeader("address","shanghai");
        response.addHeader("address","beijin");


        //服务端返回的数据要按照一定的格式要求进行渲染，只有html才会识别标签
        response.setHeader("Content-Type","text/html");
        response.setContentType("text/html");

        /**
         * 响应头
         */
        //设置响应状态码
        response.sendError(404,"not found");
        response.getWriter().write("<b>java is easy</b>");

    }
}
