package com.lxg.hw.t002;

import java.util.Scanner;

/**
 * @author lxg
 * @description 第二题
 * @date 2021/9/23
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写，字符串长度小于500。
 * 输入描述：
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。
 * 输出描述：
 * 输出输入字符串中含有该字符的个数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        char[] ss1 = s1.trim().toLowerCase().toCharArray();
        char ss2 = s2.trim().charAt(0);
        int num = 0;
        for (int i = 0; i <ss1.length ; i++) {
            if(ss2==ss1[i] || (ss2+32)==ss1[i]){
                    num++;
            }
        }
        System.out.println(num);
    }
}
