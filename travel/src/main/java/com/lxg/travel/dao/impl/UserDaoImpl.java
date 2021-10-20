package com.lxg.travel.dao.impl;

import com.lxg.travel.dao.UserDao;
import com.lxg.travel.domain.User;
import com.lxg.travel.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author lxg
 * @description 用户Dao
 * @date 2021/10/20
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public void save(User user) {
        String sql = "insert into tab_user(username,password,name,birthday,sex,telephone,email) values(?,?,?,?,?,?,?)";
        System.out.println(user);
        template.update(sql,
                user.getUsername(),
                user.getPassword(),
                user.getName(),
                user.getBirthday(),
                user.getSex(),
                user.getTelephone(),
                user.getEmail()
                );

    }

    @Override
    public User findByUserName(String name) {
        User user = null;

        try {
            //定义SQL
            String sql = "select * from tab_user where name = ?";
            //执行sql
            user = template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),name);
        }catch (Exception e){

        }
        return user;
    }
}
