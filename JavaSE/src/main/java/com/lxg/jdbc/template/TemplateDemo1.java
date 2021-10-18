package com.lxg.jdbc.template;

import com.lxg.jdbc.druid.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author lxg
 * @description Spring JDBC演示
 * @date 2021/10/3
 */
public class TemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //调用方法
        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql,3);
        System.out.println(count);
    }
}
