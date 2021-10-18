package com.lxg.jdbc.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author lxg
 * @description c3p0演示
 * @date 2021/10/3
 */
public class C3p0Demo1 {
    public static void main(String[] args) throws SQLException {
        //获取数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        //获取数据库连接
        Connection conn = ds.getConnection();
        //打印
        System.out.println(conn);

        //关闭
        conn.close();
    }
}
