package com.lxg.springboot3_web.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.List;

/**
 * @author lxg
 * @description 自定义配置满足需求：
 * 在SpringBoot项目中，当引入spring-boot-starter-web依赖后，该依赖又依赖了
 * spring-boot-autoconfigure,在这个自动化配置中，有一个WebMvcAutoConfiguration类提供了对SpringMVC最基本的
 * 配置，如果某一项自动化配置不满足需求，可以自定义配置，只需要实现WebMvcConfigurer接口即可
 * @date 2021/10/26
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        //设置时间格式
        config.setDateFormat("yyyy-MM-dd");
        //数据编码
        config.setCharset(Charset.forName("UTF-8"));
        config.setSerializerFeatures(
                SerializerFeature.WriteClassName, //生成的JSON中输出类名
                SerializerFeature.WriteMapNullValue,//是否输出value为null的数据
                SerializerFeature.PrettyFormat,//生成JSON的格式
                SerializerFeature.WriteNullListAsEmpty,//空集合输出[]而非NULL
                SerializerFeature.WriteNullStringAsEmpty//空字符串输出“”而非null
        );
        converter.setFastJsonConfig(config);
        //将自定义的FastJsonHttpMessageConverter加入到converters中。
        converters.add(converter);
    }
}
