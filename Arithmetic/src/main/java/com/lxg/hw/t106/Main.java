package com.lxg.hw.t106;

import java.util.Scanner;

/**
 * @author lxg
 * @description 字符串逆序
 * @date 2021/9/30
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = str.trim().length()-1; i >= 0  ; i--) {
            System.out.print(str.trim().charAt(i));
        }

    }
}
