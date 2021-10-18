package com.lxg.spring_mvc2.domain;

import java.util.List;

/**
 * @author lxg
 * @description VO
 * @date 2021/10/10
 */
public class VO {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
