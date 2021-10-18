package com.lxg.hw.t003;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author lxg
 * @description 第二种写法
 * @date 2021/9/26
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            TreeSet<Integer> set = new TreeSet<Integer>();
            int num = input.nextInt();
            for (int i = 0; i <num ; i++) {
                set.add(input.nextInt());
            }
            Iterator iterator = set.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
