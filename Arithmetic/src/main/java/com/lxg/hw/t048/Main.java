package com.lxg.hw.t048;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author lxg
 * @description HJ48 从单向链表中删除指定值的节点
 * @date 2021/10/5
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().trim().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i <str.length ; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(arr[1]);
        for (int i = 2; i <arr.length-2 ; i+=2) {
            int loc = list.indexOf(arr[i+1]);
            list.add(loc+1,arr[i]);
        }
        int loc = list.indexOf(arr[arr.length-1]);
        list.remove(loc);
        for (Integer i:list) {
            System.out.print(i+" ");
        }

    }
}
