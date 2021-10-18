package main.java.com.lxg.control;

import com.lxg.entity.User;
import com.lxg.service.UserService;
import com.lxg.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户数据
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        //封装对象
        User user = new User(name,pwd);
        //调用Service进行逻辑处理
        User u = userService.checkUser(user);
        System.out.println(u);

        if(u!=null){
            response.getWriter().write("success");
        }else{
            response.getWriter().write("failure");
        }
    }
}
