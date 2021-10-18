package com.lxg.hw.t002;

import java.util.Scanner;

/**
 * @author lxg
 * @description 第二种写法
 * @date 2021/9/26
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        //转换
        String ss1 = s1.trim().toUpperCase();
        char ss2 = s2.trim().toUpperCase().charAt(0);

        //循环
        int count=0;
        for (int i = 0; i <ss1.length() ; i++) {
            if (ss2==ss1.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
