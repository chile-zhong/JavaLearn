package com.lxg.hw;

import java.io.File;

/**
 * @author lxg
 * @description 创建包
 * @date 2021/9/28
 */
public class mkdir {
    public static void main(String[] args) {
        String path = "E:\\IDEAWorkspace\\JavaLearn\\Arithmetic\\src\\main\\java\\com\\lxg\\hw";
        for (int i = 100; i <=108 ; i++) {
                File f = new File(path+"\\t"+i);
                f.mkdir();
        }
    }
}
