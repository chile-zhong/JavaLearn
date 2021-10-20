package com.lxg.travel.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lxg.travel.domain.ResultInfo;
import com.lxg.travel.domain.User;
import com.lxg.travel.service.UserService;
import com.lxg.travel.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author lxg
 * @description 用户注册
 * @date 2021/10/20
 */
@WebServlet("/registUserServlet")
public class RegistUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        //获取数据
        Map<String, String[]> map = req.getParameterMap();

        //封装对象
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //调用Service完成注册
        UserService service = new UserServiceImpl();
        boolean flag = service.regist(user);

        ResultInfo info = new ResultInfo();
        if(flag){
            //注册成功
            info.setFlag(true);
        }else{
            //注册失败
            info.setFlag(false);
            info.setErrorMsg("注册失败");
        }

        //将info对象序列化为json对象
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);

        //将json数据写回客户端
        //设置contentType
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().print(json);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
