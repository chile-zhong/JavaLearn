package com.lxg.stream.file;

import java.io.File;
import java.io.IOException;

/**
 * @author lxg
 * @description File操作文件演示
 * @date 2021/9/28
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //将文件封装成一个file类
        File f = new File("d:\\test.txt");
        File f1 = new File("d:\\test.txt");
        File f2 = new File("d:/text.txt");
        //File.separator属性帮我们获取当前操作系统的路径拼皆符
        File f3 = new File("d:"+File.separator+"text.txt");//跨平台使用建议使用这种

        //常用的方法
        boolean canRead = f.canRead();
        boolean canWrite = f.canWrite();
        boolean canExecute = f.canExecute();
        System.out.println("文件是否可读："+canRead);
        System.out.println("文件是否可写："+canWrite);
        System.out.println("文件是否可操作："+canExecute);
        System.out.println("文件名字"+f.getName());
        System.out.println("上级目录"+f.getParent());
        System.out.println("是否是一个文件夹"+f.isDirectory());
        System.out.println("是否是一个文件"+f.isFile());
        System.out.println("是否隐藏"+f.isHidden());
        System.out.println("文件大小"+f.length());
        System.out.println("是否存在"+f.exists());
        /*if(f.exists()){ //如果文件存在则删除
            f.delete();
        }else{//如果文件不存在，则创建
            f.createNewFile();
        }*/
        System.out.println(f==f1);//比较两个对象的地址
        System.out.println(f.equals(f2));//比较两个文件的路劲

        //跟路径相关的方法
        System.out.println("绝对路径:"+f.getAbsoluteFile());
        System.out.println("相对路径:"+f.getPath());
        //toString的效果永远是 相对路径
        System.out.println("toString:"+f.toString());

    }
}
