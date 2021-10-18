package com.lxg.springboot1.controller;

import com.lxg.springboot1.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxg
 * @description 测试将配置文件属性值赋给JavaBean的属性
 * @date 2021/10/14
 */
@RestController  // @Controller 效果一样，在springboot中，推荐使用前者
@EnableConfigurationProperties({ConfigBean.class}) //允许使用配置文件注入的属性值
public class LucyController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/lucy")
    public String lucy(){
        String re = configBean.getName()+","+configBean.getAge()+","+configBean.getNumber()+
                ","+configBean.getGreeting();
        return re;
    }
}
