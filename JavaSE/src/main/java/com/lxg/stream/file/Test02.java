package com.lxg.stream.file;

import java.io.File;

/**
 * @author lxg
 * @description File对目录进行操作演示
 * @date 2021/9/28
 */
public class Test02 {
    public static void main(String[] args) {
        //将目录封装为File类
        String path = "E:\\IDEAWorkspace\\JavaLearn\\Java\\src\\main\\java\\com\\lxg\\io\\file";
        File f1 = new File(path + "\\a");
        File f2 = new File(path + "\\b\\c");
        //跟目录相关的方法
        //创建目录
        f1.mkdir();//创建单层目录
        f2.mkdirs();//创建多层目录

        //删除：如果是删除目录的话，只会删除一层，并且前提：这层目录是空的，里面没有内容
        f2.delete();

        //查看
        File f3 = new File("E:\\IDEAWorkspace\\JavaLearn\\Java\\src\\main\\java\\com\\lxg");
        String[] list = f3.list();//文件夹下文件夹和文件名字的数组
        for (String s:list) {
            System.out.println(s);
        }

        File[] files = f1.listFiles();//返回文件夹下所有对象的数组，作用更加广泛
        for (File f:files) {
            System.out.println(f.getName()+","+f.getAbsolutePath());
        }

    }
}
