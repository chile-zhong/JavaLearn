package com.lxg.hw.t001;

import java.util.Scanner;

/**
 * @author lxg
 * @description 使用切片方法解题
 * @date 2021/9/26
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.trim();
        System.out.println(s.length()-1-s.lastIndexOf(" "));
    }
}
