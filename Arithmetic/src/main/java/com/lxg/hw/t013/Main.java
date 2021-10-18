package com.lxg.hw.t013;

import java.util.Scanner;

/**
 * @author lxg
 * @description 句子逆序
 * @date 2021/9/27
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] ss = s.trim().split(" ");
        for (int i = ss.length-1; i >=0 ; i--) {
            System.out.print(ss[i]+" ");
        }
    }
}
