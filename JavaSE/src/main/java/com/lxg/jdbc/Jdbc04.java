package com.lxg.jdbc;

import com.lxg.jdbc.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lxg
 * @description 练习
 * @date 2021/10/3
 */
public class Jdbc04 {

    public static void main(String[] args) {
        List<Emp> list = new Jdbc04().findAll();
        System.out.println(list);
    }

    /**
     * 查询所有emp对象
     * @return
     */
    public List<Emp> findAll(){
        String url = "jdbc:mysql://localhost:3306/mysql_test?serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;
        List<Emp> list = new ArrayList<Emp>();
        Emp emp = null;
        String select = "select * from emp";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            re = stmt.executeQuery(select);
            while(re.next()){
                int id = re.getInt("id");
                String ename = re.getString("ename");
                int job_id = re.getInt("job_id");
                int mgr = re.getInt("mgr");
                Date joindate = re.getDate("joindate");
                double salary = re.getDouble("salary");
                double bonus = re.getDouble("bonus");
                int dept_id = re.getInt("dept_id");

                //创建emp对象
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                //装载集合
                list.add(emp);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
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
            return list;
        }
    }
}
