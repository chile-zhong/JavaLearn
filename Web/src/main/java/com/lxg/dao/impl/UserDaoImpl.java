package main.java.com.lxg.dao.impl;



import main.java.com.lxg.dao.UserDao;
import main.java.com.lxg.entity.User;

import java.sql.*;

/**
 * @author lxg
 * @description UserDao接口实现类
 * @date 2021/9/11
 *
 * 跟数据库发生交互
 */
public class UserDaoImpl implements UserDao {


    public User checkUser(User user) {

        //定义链接对象
        Connection conn= null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User u = null;

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取链接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?serverTimezone=UTC&characterEncoding=utf8","root","root");

            //获取预处理块
            pstmt = conn.prepareStatement("select * from user  where name = ? and pwd = ?");

            //给？赋值
            pstmt.setString(1,user.getName());
            pstmt.setString(2,user.getPwd());

            //执行SQL语句
            rs = pstmt.executeQuery();

            //从request中获取结果值
            while(rs.next()){
                u = new User(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
         return u;
    }
}
