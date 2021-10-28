package com.lxg.springboot2.controller;

import com.lxg.springboot2.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxg
 * @description 测试
 * @date 2021/10/25
 */
@RestController
public class BookController {

    @Autowired
    Book book;

    @RequestMapping("/book")
    public String book(){
        return book.toString();
    }
}
