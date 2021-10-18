package com.lxg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author lxg
 * @description JDBC入门
 * @date 2021/9/29
 *
 */
public class Jdbc01 {
    public static void main(String[] args) throws Exception {

        //1.导入驱动jar包，在pom.xml中加入依赖

        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //3.获取数据库链接对象
        /**
         * DriverManager:驱动管理对象
         * 功能：
         *  1.注册驱动：告诉程序该使用哪一个数据库驱动jar包
         *      static void Register Driver(Driver dervier):注册与给定的驱动程序DriverManager
         *      代码使用：Class.forName("com.mysql.cj.jdbc.Driver");的写法，
         *      其实在com.mysql.cj.jdbc.Driver类中，有静态代码块如下：
         *      static {
         *         try {
         *             DriverManager.registerDriver(new Driver());
         *         } catch (SQLException var1) {
         *             throw new RuntimeException("Can't register driver!");
         *         }
         *     }
         *   注意：mysql5之后的驱动Jar包可以省略注册驱动的步骤，如果要写的话，如下
         *       Class.forName("com.mysql.cj.jdbc.Driver");
         * 2.获取数据库链接
         *  方法：public static Connection getConnection(String url,String user, String password)
         *  参数：
         *      url：指定链接路径
         *          语法：jdbc:mysql//ip地址(域名):端口号/数据库名称
         *          细节：如果链接的是本机的mysql服务器，并且mysql端口是3306，则url可以简写如下：
         *              jdbc:mysql//数据库名
         *      user:用户名
         *      password:密码
         *
         *
         *
         *Connection:数据库链接对象
         * 1.功能
         *      获取执行sql的对象
         *          * Statement createStatement();
         *          * PreparedStatement prepareStatement(String sql);
         *
         *      管理事务
         *          * 开启事务：setAutoCommit(boolean autocommit):调用此方法将参数设置为false，即开启事务
         *          * 提交事务：commit()
         *          * 回滚事务：rollback()
         */
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_test?serverTimezone=UTC","root","root");

        //4.定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        String select = "select * from account";

        //5.获取执行sql的对象Statement
        /**
         * Statement:执行sql对象
         * 1.执行sql
         *      * boolean execute(String sql):可以执行任意的sql
         *      * int executeUpdate(String sql):执行DML(数据库操作语句 insert update delete)，
         *          返回值：影响的行数，可以通过这个影响行数判断DML语句是否执行成功。返回值>0则执行成功，否者执行失败。
         *      * ResultSet executeQuery(String sql):执行DQL（select）语句
         *
         *
         * PreparedStatement:执行sql的对象
         *  1.SQL注入问题：在拼接SQL时，有一些特殊的关键字参与到字符串的拼接，会造成安全性问题
         *    如：随便输入用户名，输入密码：a' or 'a' = 'a 等就造成拼接的sql语句永远查出非空的结果集
         *  2.解决sql注入问题：使用PreparedStatement对象来解决
         *  3.预编译SQL：参数使用？作为占位符拼接sql，再为占位符赋值。
         *  4.使用PreparedStatement对象步骤：
         *      * 导入jar包
         *      * 注册驱动
         *      * 获取数据库链接对象
         *      * 定义sql
         *          注意：sql的参数使用？作为占位符。如select * from user where username =? and password = ？;
         *      * 获取执行sql的对象PreparedStatement: Connection.preparedStatement(String sql)
         *      * 给？赋值
         *          方法：setXXX(参数1，参数2)
         *             参数1：？的位置编号 从1开始
         *             参数2：传入的参数值
         *      * 执行sql，接收返回结果，不需要传递sql语句
         *      * 处理结果
         *      * 释放资源
         */
        Statement statement = conn.createStatement();

        //6.执行sql]
        /**
         * ResultSet: 结果集对象，封装查询结果
         *    * next():游标向下移动，判断当前行是否最后一行末尾（是否有数据）,如果是则返回false,不是则返回true。
         *    * getXXX():获取数据 如getString()
         *         参数：
         *              int:代表列的编号  ，从1开始 如getString(1)
         *              String：代表列的名称 如：getInt("id");
         *    * 注意：
         *          使用步骤
         *             1.游标向下移动一行
         *             2.判断是否有数据
         *             3.获取数据
         */
        ResultSet re = statement.executeQuery(select);
        int count = statement.executeUpdate(sql);

        //7.处理结果
        System.out.println(count);

        //8.释放资源
        statement.close();
        conn.close();
    }
}
