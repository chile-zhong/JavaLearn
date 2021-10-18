package com.lxg.hw.t101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lxg
 * @description 数组排序
 * @date 2021/9/29
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String count = in.readLine();
        String[] read = in.readLine().trim().split(" ");
        int method = Integer.parseInt(in.readLine().trim());
        int num = Integer.parseInt(count.trim());
        int nums[] = new int[num];
        for (int i = 0; i <num ; i++) {
            nums[i] = Integer.parseInt(read[i]);
        }
        if(method==0){
            bubbleSortAsc(nums);
        }
        if (method==1){
            bubbleSortDesc(nums);
        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    /**
     * 冒泡排序实现升序排序
     * @param array
     */
    public static void bubbleSortAsc(int[] array){
        if(array==null || array.length<2){
            return;
        }
        int len = array.length;
        boolean hasChange = true;
        for (int i = 0; i <len-1 && hasChange; i++) {
            hasChange = false;
            for (int j = 0; j <len-1-i ; j++) {
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    hasChange = true;
                }
            }
        }
    }

    /**
     * 冒泡排序降序
     * @param array
     */
    public static void bubbleSortDesc(int[] array){
        if(array==null || array.length<2){
            return;
        }
        int len = array.length;
        boolean hasChange = true;
        for (int i = 0; i <len-1 && hasChange; i++) {
            hasChange = false;
            for (int j = 0; j <len-1-i ; j++) {
                if(array[j]<array[j+1]){
                    swap(array,j,j+1);
                    hasChange = true;
                }
            }
        }
    }

    /**
     * 交换两个位置的值
     * @param nums
     * @param i
     * @param j
     */
    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
