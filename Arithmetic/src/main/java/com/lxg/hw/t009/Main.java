package com.lxg.hw.t009;

import java.util.Scanner;

/**
 * @author lxg
 * @description 第九题 提取不重复的整数
 * @date 2021/9/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String str = input.nextLine().trim();
            int length = str.length();
            //数组记录0~9这是个数字出现的次数，索引表示数字，值代表出现的次数，初始化都是0.
            int[] num = new int[10];
            //从右向左循环
            for (int i = length-1; i >= 0; i--) {
                if(num[(str.charAt(i)-'0')]==0){//出现的次数为0次
                    System.out.print(str.charAt(i));
                    num[str.charAt(i)-'0']++;//出现了一次，给记录上
                }
            }
    }
}
