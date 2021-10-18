package com.lxg.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 引导类，SpringBoot项目的入口
 * Spring Boot使用jar打包方式
 * Spring Boot的引导类，是项目入口，运行main方法就可以启动项目
 * 使用Spring Boot和Spring构建的项目，业务代码编写方式完全一样
 */
@SpringBootApplication
//@ComponentScan("com.lxg") //标明组件扫描位置
public class Springboot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }

}
