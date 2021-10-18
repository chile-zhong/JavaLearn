package com.lxg.hw.t053;

import java.util.Scanner;

/**
 * @author lxg
 * @description 杨辉三角变形
 * @date 2021/10/5
 * //杨辉三角规律                                    行号    第一个偶数在该行第几个
 * //                    1                           1             -1
 * //                1   1   1                       2             -1
 * //            1   2   3   2   1                   3              2
 * //         1  3   6   7   6   3   1               4              3
 * //      1  4  10  16  19  16  10  4  1            5              2
 * //   1  5  15 30  45  51  45  30  15 5  1         6              4
 * //
 * //  首个偶数在该行第几个的规律： -1 -1 （2 3 2 4）···（2 3 2 4）
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if(num == 1 || num == 2){//1、2行没有偶数
                System.out.println(-1);
                continue;
            }
            else if(num % 4 == 1 || num % 4 == 3){
                System.out.println(2);
                continue;
            }
            else if(num % 4 == 0){
                System.out.println(3);
                continue;
            }
            else if(num % 4 == 2){
                System.out.println(4);
                continue;
            }
        }
    }
}
