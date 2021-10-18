package com.lxg.spring4.domain;

/**
 * @author lxg
 * @description 用户类
 * @date 2021/10/8
 */
public class User {
    private String name;
    private String add;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
