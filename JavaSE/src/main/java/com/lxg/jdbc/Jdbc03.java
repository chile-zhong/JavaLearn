package com.lxg.jdbc;

import java.sql.*;

/**
 * @author lxg
 * @description 测试查询结果ResultSet
 * @date 2021/9/29
 */
public class Jdbc03 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql_test?serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            String sql = "select * from account";
            re = stmt.executeQuery(sql);
            while(re.next()){
                int id = re.getInt("id");
                String name = re.getString("name");
                double balance = re.getDouble("balance");
                System.out.println(id+","+name+","+balance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(re!=null){
                    re.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
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
