package com.lxg.hw.t108;

import java.util.Scanner;

/**
 * @author lxg
 * @description 最小公倍数
 * @date 2021/9/30
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().trim().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        System.out.println(a*b/getGcd(a,b));
    }

    /**
     * 获取两个整数的最大公约数。
     * @param m
     * @param n
     * @return
     */
    public static int getGcd(int m,int n){
        if(m<n){
            int temp;
            temp = m;
            m = n;
            n = temp;
        }

        while(m%n!=0){
            int i = m%n;
            m = n;
            n = i;
        }
        return n;
    }
}
