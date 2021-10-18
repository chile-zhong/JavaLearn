package com.lxg.basic;

/**
 * 数据类型
 */
public class DataTypeDemo {

    public static void main(String[] args) {
        //byte b = 128;
        //short s = 44444;
        //int i = 1111111111111;
        //long l = 1213123123123123L;
        //int a = 10;

        //int a = 3111111111;
        //long b = 3111111111L;

        float f1 = 2.1223123234123131F;
        float f2 = 2.122312331231312123F;
        System.out.println(f1==f2);

        //表示一个字符
        char a = 'A';
        //表示一个字符串，表示一个字符序列
        String s = "A";
        System.out.println(a==65);
        char ch = '\t';
        System.out.println("["+ch+"]");
    }
}
