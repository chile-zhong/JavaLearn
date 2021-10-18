package com.lxg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author lxg
 * @description 联系例子
 * @date 2021/9/29
 */
public class Jdbc02 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql_test?serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            String sql = "insert into account values(null,'王五',3000)";
            String update = "update account set balance = 500 where id =3";
            String delete = "delete from account where id =3";
            int count = stmt.executeUpdate(sql);
            if(count>0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
