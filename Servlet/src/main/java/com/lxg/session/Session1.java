package com.lxg.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author lxg
 * @description 1
 * @date 2021/10/23
 */
@WebServlet("/session1")
public class Session1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         * 细节：
         * 1.当客户端关闭，服务器不关闭，两次访问session是否为同一个？
         *      - 默认情况下，不是同一个
         *      - 但是可以通过代码编写设置，创建Cookie 键为JSESSIONID， 让cookie持久化保存
         *        Cookie c = new Cookie("JSESSIONID",session.getId());
         *
         * 2.当客户端不关闭，服务器关闭后，两次访问session是否为同一个？
         *      - 不是同一个session，但是需要确保数据不丢失
         *          * session钝化
         *            在服务器正常关闭之前，将session对象序列化到硬盘上
         *          * session活化
         *            在服务器启动后，将session文件转换为session对象即可
         *
         * 3.session什么时候被销毁？
         *      - 服务器关闭
         *      - session对象调用invalidate()方法
         *      - session默认失效时间30分钟
         *        可以根据需求配置参数
         *         <session-config>
         *             <session-timeout>30</session-timeout>
         *         </session-config>
         *
         *session特点：
         * 1.session存储在服务端，cookie存储在客户端
         * 2.session没有数据大小限制，cookie有
         * 3.session数据安全，Cookie数据相对不安全。
         */

        //使用session获取数据
        //获取session
        HttpSession session = req.getSession();
        System.out.println(session);

        //期望客户端关闭后，session也能相同
        Cookie c = new Cookie("JSESSIONID",session.getId());
        c.setMaxAge(60*60);//设置session存货时间
        resp.addCookie(c);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}