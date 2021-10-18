package com.lxg.hw.t011;

import java.util.Scanner;

/**
 * @author lxg
 * @description 数字颠倒
 * @date 2021/9/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        for (int i = num.trim().length()-1; i >= 0 ; i--) {
            System.out.print(num.charAt(i));
        }
    }
}
