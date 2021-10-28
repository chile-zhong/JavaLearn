package com.lxg.springboot3_web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * @author lxg
 * @description 书
 * @date 2021/10/26
 */
public class Book {
    private String name;
    private String author;

    //配置忽略这个字段
    @JsonIgnore
    private Float price;

   //配置时间格式化
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;

    public Book() {
    }

    public Book(String name, String author, Float price, Date publicationDate) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
