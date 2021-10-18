package com.lxg.dataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.lxg.annocation.config.SpringConfiguration;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author lxg
 * @description 测试手动创建数据源
 * @date 2021/10/8
 */
public class DataSourceTest {

    /**
     * 测试手动创建 c3p0数据源
     */
    @Test
    public void test1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql_test?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * 测试手动创建 druid数据源
     */
    @Test
    public void test2() throws PropertyVetoException, SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mysql_test?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * 测试手动创建 c3p0数据源 (加载配置文件形式)
     */
    @Test
    public void test3() throws PropertyVetoException, SQLException {
        //读取配置文件
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String user = rb.getString("jdbc.user");
        String password = rb.getString("jdbc.password");

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * 测试Spring创建c3p0数据库连接池
     */
    @Test
    public  void test4() throws SQLException {
        ApplicationContext app = new ClassPathXmlApplicationContext("application_dataSource.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource) app.getBean("dataSource");

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();
    }





    /**
     * 测试Spring创建druid数据库连接池
     */
    @Test
    public  void test5() throws SQLException {
        ApplicationContext app = new ClassPathXmlApplicationContext("application_dataSource.xml");
        DruidDataSource dataSource = (DruidDataSource) app.getBean("dataSource2");

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();
    }


    @Test
    public  void test6() throws SQLException {
        //ApplicationContext app = new ClassPathXmlApplicationContext("application_dataSource.xml");

        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ComboPooledDataSource dataSource = (ComboPooledDataSource) app.getBean("dataSource1");

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();
    }

}
