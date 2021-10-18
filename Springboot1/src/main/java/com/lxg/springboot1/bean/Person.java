package com.lxg.springboot1.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lxg
 * @description Person
 * @date 2021/10/14
 */
@Component
@ConfigurationProperties(prefix = "person") //需要指明前缀，即指定需要使用配置文件中哪个属性值来注入
public class Person {

    private String name;
    private Integer age;
    private String sex;
    private List<String> likes;

    public Person() {
    }

    public Person(String name, Integer age, String sex, List<String> likes) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", likes=" + likes +
                '}';
    }
}
