package com.lxg.stream.file;

import java.io.File;

/**
 * @author lxg
 * @description File类判断和获取功能
 * @date 2021/10/7
 */
public class File3 {
    public static void main(String[] args) {
        File f = new File("E:\\IO");

        //判断是否为目录
        boolean directory = f.isDirectory();
        //判断是否为文件
        boolean file = f.isFile();
        //判断是否存在
        boolean exists = f.exists();
        //获取绝对路径
        String absolutePath = f.getAbsolutePath();
        //将抽象路径名转换为路径名字字符串
        String path = f.getPath();
        //返回此抽象路名名表示的文件或目录名称
        String name = f.getName();
        //返回此路径名表示的目录中的文件和目录的名称字符串数组
        String[] list = f.list();
        //返回子路径名表示的目录中的文件和目录的file对象数组
        File[] files = f.listFiles();

    }
}
