package com.lxg.springboot1.controller;

import com.lxg.springboot1.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxg
 * @description hello Springboot
 * @date 2021/10/14
 */
@RestController
//@Controller 这两个注解都可以使用
@EnableConfigurationProperties({Person.class})
public class HelloController {

    //使用@Value注解获取属性值
    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String name1;

    @Value("${address[0]}")
    private String address;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    //使用Environment对象来获取属性
    @Autowired
    private Environment env;

    //使用@ConfigurationProperties
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    @ResponseBody //标志只返回数据，不跳转页面
    public String hello(){

        System.out.println(name);
        System.out.println(name1);
        System.out.println(address);
        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println("-----------------------------------");

        String name = env.getProperty("person.name");
        System.out.println(name);


        return "hello，springboot";
    }
}
