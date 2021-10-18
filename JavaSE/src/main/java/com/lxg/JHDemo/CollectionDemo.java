package com.lxg.JHDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lxg
 * @description 集合框架类
 * @date 2021/9/4
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        collection.add(1.23);
        collection.add("abc");
        System.out.println(collection);

        //在指定位置加入数据
        ((ArrayList)collection).add(0,"lxg");
        System.out.println(collection);

        //在一个集合后面增加另外一个集合
        Collection collection1 = new ArrayList();
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        collection1.add("d");
        collection.addAll(collection1);
        System.out.println(collection);
    }
}
