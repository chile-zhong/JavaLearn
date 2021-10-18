package com.lxg.hw.t105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lxg
 * @description 描述 从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值，
 * 结果保留一位小数，如果没有非负数，则平均值为0 本题有多组输入数据，输入到文件末尾，
 * 请使用while(cin>>)读入 数据范围小于1e6 输入描述： 输入任意个整数，每行输入一个。
 * 输出描述： 输出负数个数以及所有非负数的平均值
 * 示例1 输入：
 * -13
 * -4
 * -7 输
 * 出：
 * 3
 * 0.0
 * @date 2021/9/30
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        while(in.hasNextInt()){
            int num = in.nextInt();
            nums.add(num);
        }
        int count_minus = 0;
        int count_positive = 0;
        double sum_positive=0.0;
        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i)<0){
                count_minus++;
            }
            if(nums.get(i)>=0){
                count_positive++;
                sum_positive+=nums.get(i);
            }
        }
        System.out.println(count_minus);
        if(count_positive==0){
            System.out.println(0);
        }else {
            String re = String.format("%.1f",sum_positive);
            System.out.println(re);
        }
    }
}
