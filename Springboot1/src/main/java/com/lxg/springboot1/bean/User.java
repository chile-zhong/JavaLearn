package com.lxg.springboot1.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author lxg
 * @description user类
 * @date 2021/10/14
 *
 * 在最新版本的springboot，需要加这三个注解。
 * @Configuration
 * @PropertySource(value = “classpath:test.properties”)
 * @ConfigurationProperties(prefix = “com.forezp”);
 * 在1.4版本需要 PropertySource加上location。
 */
@Component //Bean
@Configuration
@PropertySource(value = "classpath:test.properties") //配置文件位置
@ConfigurationProperties(prefix = "com.forezp") //标明配置文件中的前缀
public class User {
    private String name;
    private int age;

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
}
