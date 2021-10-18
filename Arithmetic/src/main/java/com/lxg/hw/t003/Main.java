package com.lxg.hw.t003;


import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author lxg
 * @description 第三题
 * @date 2021/9/23
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<Integer>();

        //获取输入数据存入set中
        while(in.hasNext()){
            int count = in.nextInt();
            for (int i = 0; i <count ; i++) {
                set.add(in.nextInt());
            }

            //将set转换为数组
            Object[] a = set.toArray();
            //调用Arrays工具的sort()方法进行排序（升序）
            Arrays.sort(a);
            //输出数据
            for (int i = 0; i <a.length ; i++) {
                System.out.println(a[i]);
            }
            set.clear();
        }
    }
}
