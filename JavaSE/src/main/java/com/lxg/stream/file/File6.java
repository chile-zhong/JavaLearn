package com.lxg.stream.file;

import java.io.File;

/**
 * @author lxg
 * @description 使用递归遍历目录
 * @date 2021/10/7
 *
 * 需求：给定一个路径(E:\itcast)，通过递归完成遍历该目录下所有内容，并把所有文件的绝对路径输出在控制台
 * 思路：
 *  - 根据给定的路径创建File类
 *  - 定义一个方法，用于获取给定路径目录下的所有内容，参数为第一步创建的File对象
 *  - 获取给定的File目录下所有的文件或者目录的File数组
 *  - 遍历还File数组，得到每一个File对象
 *  - 判断给File对象是否是目录
 *         是：递归调用
 *         不是：获取绝对路径输出到控制台
 *  - 调用方法
 *
 */
public class File6 {
    public static void main(String[] args) {
        File f= new File("E:\\IO");
        getAllFilePath(f);
    }

    /**
     * 获取给定目录下的所有内容
     * @param srcFile
     */
    public static void getAllFilePath(File srcFile){
        //获取给定目录下的所有文件后者目录的数组
        File[] files = srcFile.listFiles();
        //遍历该数组，得到每一个file对象
        if(files!=null){
            for (File f:files) {
                //判断是否是目录
                if(f.isDirectory()){
                    //是，递归掉用方法
                    getAllFilePath(f);
                }else {
                    //不是，输出文件路径
                    System.out.println(f.getAbsoluteFile());
                }
            }
        }
    }
}
