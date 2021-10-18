package com.lxg.hw.t012;

import java.util.Scanner;

/**
 * @author lxg
 * @description 字符串反转
 * @date 2021/9/27
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
