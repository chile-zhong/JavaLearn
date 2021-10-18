package main.java.com.lxg.control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /**
         * 使用最原始的方式
         */
        System.out.println("接收到客户端请求的数据，返回响应的登录页面");
        //设置响应编码
        response.setContentType("text/html");
        //获取响应的输出流对象
        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("</head>");
        out.write("<body>");
        out.write("<form action='login' method='get'>");
        out.write("nam: <input type='text' name='name' value=''>");
        out.write("pwd: <input type='text' name='pwd' value=''>");
        out.write("<input type='submit' value='login'>");
        out.write("</form>");
        out.write("</body>");
        out.write("</html>");
    }
}
