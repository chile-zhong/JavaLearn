package com.lxg.hw.t047;

import java.util.Scanner;

/**
 * @author lxg
 * @description 截取字符串
 * @date 2021/10/5
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str = in.nextLine();
            int len = Integer.parseInt(in.nextLine().trim());
            char[] chars = str.trim().toCharArray();
            for (int i = 0; i <len ; i++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}
