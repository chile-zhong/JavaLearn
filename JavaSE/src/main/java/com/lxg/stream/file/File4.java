package com.lxg.stream.file;

import java.io.File;
import java.io.IOException;

/**
 * @author lxg
 * @description File类删除功能
 * @date 2021/10/7
 * 删除目录是的注意事项：
 *  如果一个目录中由内容（目录、文件），不能直接删除。应该先删除目录中的内容，最后才能删除目录。
 *
 */
public class File4 {
    public static void main(String[] args) throws IOException {
        //File f = new File("E:\\IO");
        //删除由此抽象路径表示的文件或目录
        //boolean delete = f.delete();

        //创建&删除文件
        File f = new File("Java\\java.txt");
        boolean newFile = f.createNewFile();
        boolean delete = f.delete();

        //创建目录&删除目录
        File f2 = new File("Java\\a");
        boolean mkdir = f2.mkdir();
        boolean delete1 = f2.delete();

    }
}
