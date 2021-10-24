package com.lxg.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author lxg
 * @description 登录
 * @date 2021/10/23
 */
@WebServlet("/loginServlet")
public class LonginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("utf-8");
        //获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");

        //获取生成的验证码
        HttpSession session = req.getSession();
        String  checkCode_session = (String)session.getAttribute("checkCode_session");
        //删除session
        session.removeAttribute("checkCode_session");
        //先判断验证码是否正确
        if(checkCode_session!=null && checkCode_session.equalsIgnoreCase(checkCode)){
            //忽略大小写比较字符串
            //验证码一致
            if("zhangsan".equals(username)&&"123".equals(password)){
                //登录成功
                //存储用户信息
                session.setAttribute("user",username);
                //重定向到success.jsp
                resp.sendRedirect(req.getContextPath()+"/success.jsp");

            }else{
                //登录失败
                req.setAttribute("login_error","用户名或密码错误");

                //转发到登录页面
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
            //判断用户名和密码是否一致
        }else{
            //验证码不一致
            //存储提示信息到request中
            req.setAttribute("cc_error","验证码不一致");
            //转发到登录页面
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
