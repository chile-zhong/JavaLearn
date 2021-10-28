package com.lxg.springboot2.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lxg
 * @description 集合中存储对象
 * @date 2021/10/26
 */

@Component
@ConfigurationProperties(prefix = "my1")
public class Users {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
