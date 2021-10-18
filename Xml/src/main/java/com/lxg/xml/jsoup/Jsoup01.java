package com.lxg.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author lxg
 * @description Jsoup演示
 * @date 2021/10/6
 */
public class Jsoup01 {
    public static void main(String[] args) throws IOException {
        //获取Document对象，根据xml文档获取
        //2.1获取xml文档的path
        String path = Jsoup.class.getClassLoader().getResource("student.xml").getPath();
        //解析xml文档，加载文档进入内存，获取dom树 ---Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3获取元素对象
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());
        //获取第一个name的Element对象
        Element element = elements.get(0);
        //获取元素数据
        String name = element.text();
        System.out.println(name);
    }
}
