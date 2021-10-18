package com.lxg.jdbc.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author lxg
 * @description Druid演示
 * @date 2021/10/3
 */
public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        InputStream in = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(in);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
