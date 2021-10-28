package com.lxg.springboot3_web.controller;

import com.lxg.springboot3_web.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lxg
 * @description Controller
 * @date 2021/10/26
 */
@RestController //@Controller+@ResponseBody
public class BookController {

    @RequestMapping("/book")
    public Book book(){

        Book book = new Book("三国演绎","罗贯中",30f,new Date());

        //返回的对象会转换成JSON格式的数据
        /**
         * 通过Springboot自带的JSON处理方式，那么对于字段忽略、时间格式等常见需求都能通过注解来解决。
         *
         */
        return book;
    }
}
