package com.lxg.springboot2.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lxg
 * @description 书
 * @date 2021/10/25
 *
 * Spring提供了@Value注解以及EnvironmentAware接口来将Spring Environment中的数据注入到属性上，
 * Springboot对此进一步提出了类型安全配置属性（Type-safe ConfigurationPropertied）, 这样即使在数据
 * 量非常庞大的情况下，也可以更加方便的将配置文件中的数据注入到Bean中。
 *
 *
 * @@ConfigurationProperties中的prefix属性描述了加载的配置文件的前缀。
 *
 * SpringBoot采用了一种宽松的规则来进行数据绑定，如果Bean中的属性名为authorName,那么配置文件
 * 中的属性可以是book.author_name、book.author-name、book.authorName或者
 * book.AYTHORNAME
 */
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String name;
    private String author;
    private Float price;

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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
