package com.lxg.hw.t008;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author lxg
 * @description 合并表记录
 * @date 2021/9/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int n = Integer.parseInt(str.nextLine());
        for (int i = 0; i < n; i++) {
            String[] mid = str.nextLine().trim().split(" ");
            int k = Integer.parseInt(mid[0]);
            int v = Integer.parseInt(mid[1]);
            if (map.get(k) != null) {
                map.put(k, map.get(k) + v);
            } else {
                map.put(k, v);
            }
        }
        for (Integer i:map.keySet()) {
            System.out.println(i+" "+map.get(i));
        }
    }
}