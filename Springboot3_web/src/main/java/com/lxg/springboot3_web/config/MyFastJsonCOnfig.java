package com.lxg.springboot3_web.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.Charset;

/**
 * @author lxg
 * @description FastJson类型转换器
 * 自定义MyFastJsonCOnfig，完成对FastJsonHttpMessageConverter Bean的提供
 *
 * MyFastJsonCOnfig配置完成后，还需要配置以下响应编码，否则返回的JSON中文会乱码，
 * 需要在application.properties中配置如下：
 * spring.http.encoding.force-response=true
 * @date 2021/10/26
 */
@Configuration
public class MyFastJsonCOnfig {

    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
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
        return converter;
    }
}
