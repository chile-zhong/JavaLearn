package com.lxg.hw.t103;

import java.util.Scanner;

/**
 * @author lxg
 * @description 走梅花桩
 * @date 2021/9/30
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = in.nextLine().trim().split(" ");
        int[] nums = new int[n];
        int max = 0;
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]);
            int tmp = count(nums,nums[i],getMax(nums));
            System.out.print(tmp);
            if(max<tmp){
                max = tmp;
            }
        }
        System.out.println(max);
    }

    /**
     * 统计一个属数组中在某个范围中的
     * 数据有多消少
     * @return
     */
    public static int count(int[] num,int a,int b){
        int count = 0;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]>=a && num[i]<=b){
                count++;
            }
        }
        return count;
    }
    /**
     * 获取数组中的最大值
     * @param nums
     * @return
     */
    public static int getMax(int[] nums){
       int max = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
