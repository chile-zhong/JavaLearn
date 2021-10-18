package com.lxg.stream.file;

import java.io.File;

/**
 * @author lxg
 * @description 1.Filei类概述和构造方法演示
 * @date 2021/10/7
 *
 * File类：
 * 他是文件和目录路径名的抽象表示
 *   - 文件和目录是可以通过File封装成对象的
 *   - 对于File而言，其封装的并不是正真的文件，仅仅是一个路径名而已。它可以存在，也可以不存在。将来
 *     是要通过具体的操作把这个路径的内容转换为具体的存在。
 *
 * 构造方法：
 *      File(String pathbname) 通过将给定的路径名字符串来转换为抽象路径名来创建新的File实例
 *      File(String parent,String child):从父路径名字符串和子路径名字符串来创建新的File类
 *      File(File parent,String child):从父路径名和子路径名创建新的File实例
 *
 */
public class File1 {
    public static void main(String[] args) {
        //File(String pathbname) 通过将给定的路径名字符串来转换为抽象路径名来创建新的File实例
        File file1 = new File("E:\\IO\\text1.txt");
        System.out.println(file1);

        //File(String parent,String child):从父路径名字符串和子路径名字符串来创建新的File类
        File file2 = new File("E:\\IO","test2.txt");
        System.out.println(file2);

        //File(File parent,String child):从父路径名和子路径名创建新的File实例
        File file3 = new File("E:\\IO");
        File file4 = new File(file3,"test3.txt");
        System.out.println(file4);


    }
}
