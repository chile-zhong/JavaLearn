package com.lxg.model;

import java.util.List;

public class User {
    private String name;
    private int age;
    private String gender;
    private String adde;
    private List<String> likes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdde() {
        return adde;
    }

    public void setAdde(String adde) {
        this.adde = adde;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", adde='" + adde + '\'' +
                ", likes=" + likes +
                '}';
    }
}
