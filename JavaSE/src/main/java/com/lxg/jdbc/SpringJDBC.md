# Spring JDBC
    * Spring框架对JDBC的简单封装。提供了一个JDBCTemplate对象简化JDBC的开发
    * 步骤：
        1.导入jar包
        2.创建JDBCTemplate对象。依赖于数据源DataSource
            JDBCTemplate template = new JDBCTemplate(ds)
        3.调用JDBCTemplate的方法来完成CRUD的操作
            update():执行DML语句，增删改
            queryForMap():查询结果将结果封装为map集合
            queryForList():查询结果将结果封装为list集合
            query():查询结果将结果封装为JavaBean对象
            queryForObject():查询结果，将结果封装为对象