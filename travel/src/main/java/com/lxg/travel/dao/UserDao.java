package com.lxg.travel.dao;

import com.lxg.travel.domain.User;

public interface UserDao {
    public void save(User user);

    public User findByUserName(String name);
}
