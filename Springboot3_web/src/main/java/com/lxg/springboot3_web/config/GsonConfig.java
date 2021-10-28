package com.lxg.springboot3_web.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.lang.reflect.Modifier;

/**
 * @author lxg
 * @description GSON类型转换器
 * @date 2021/10/26
 */
@Configuration
public class GsonConfig {

    @Bean
    GsonHttpMessageConverter gsonHttpMessageConverter(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("yyyy-MM-dd");//设置日期格式
        //解析时，修饰符为protected的字段被过滤掉
        builder.excludeFieldsWithModifiers(Modifier.PROTECTED);
        //创建Gson对象放入GsonHttpMessageConverter实例中，并返回converter
        Gson gson = builder.create();
        converter.setGson(gson);
        return converter;
    }
}
