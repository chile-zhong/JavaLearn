package com.lxg.hw.t015;

import java.util.Scanner;

/**
 * @author lxg
 * @description 求int型正整数在内存中1的个数
 * @date 2021/9/29
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        for (int i = 31; i >=0 ; i--) {
            int flag = (num & (1 << i))==0?0:1;
            if(flag==1){
                count++;
            }
            //System.out.print(flag);
        }
        System.out.println(count);
    }
}
