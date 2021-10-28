package com.lxg.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 引导类，SpringBoot项目的入口
 * Spring Boot使用jar打包方式
 * Spring Boot的引导类，是项目入口，运行main方法就可以启动项目
 * 使用Spring Boot和Spring构建的项目，业务代码编写方式完全一样
 */
@SpringBootApplication //@EnableAutoConfiguration+@ComponentScan
/**
 * @EnableAutoConfiguration:表示开启自动化配置
 * @ComponentScan 进行包扫描
 * @SpringBootApplication：组合注解，效果等于上面两个同时使用的效果
 */
//@ComponentScan("com.lxg") //标明组件扫描位置
public class Springboot1Application {

    public static void main(String[] args) {
        /**
         * 通过SpringApplication中的run方法启动项目，
         * Springboot1Application.class：告诉spring，这个是主要组件
         * args:运行时的其他参数
         *
         * 命令启动：
         *  mvn spring-boot:run
         *
         *  打包：
         *  mvn package
         *
         *  运行jar包启动：
         *  java -jar 包名.jar
         *
         */
        SpringApplication.run(Springboot1Application.class, args);
    }

}
