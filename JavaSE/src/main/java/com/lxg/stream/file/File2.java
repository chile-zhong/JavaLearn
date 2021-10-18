package com.lxg.stream.file;

import java.io.File;
import java.io.IOException;

/**
 * @author lxg
 * @description 2.File类创建功能
 * @date 2021/10/7
 *
 *
 */
public class File2 {
    public static void main(String[] args) throws IOException {
        //File f = new File("E:\\IO");

        //当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件,如果文件不存在则创建，
        // 返回true，如果文件存在，则返回false
        //f.createNewFile();


        //创建由此抽象路径命名的目录
        //f.mkdir();

        //创建由此抽象路径命名的目录，包括任何必须但不存在的目录，创建多级目录
        //f.mkdirs();

        //获取绝对路径
        //f.getAbsolutePath();

        //-------------------------------------------------
        //创建文件
        File f1 = new File("E:\\IO\\java.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

        //创建目录
        File f2 = new File("E:\\IO\\JavaSE");
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);

        //创建多级目录
        File f3 = new File("E:\\IO\\JavaWeb\\HTML");
        boolean mkdirs = f3.mkdirs();
        System.out.println(mkdirs);

    }
}
