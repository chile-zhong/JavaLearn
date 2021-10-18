package com.lxg.sort;

import java.util.Arrays;

/**
 * @author lxg
 * @description 冒泡排序
 * @date 2021/9/8
 * 冒泡排序：
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会
 * 经由交换慢慢“浮”到数列的顶端。
 *
 * 算法描述：
 *   比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 *   对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 *   针对所有的元素重复以上的步骤，除了最后一个；
 *   重复步骤1~3，直到排序完成。
 *
 *算法分析：
 *  空间复杂度 O(1)、时间复杂度 O(n²)。
 *
 * 分情况讨论：
 *
 * 给定的数组按照顺序已经排好：只需要进行 n-1 次比较，两两交换次数为 0，时间复杂度为 O(n)，这是最好的情况。
 * 给定的数组按照逆序排列：需要进行 n*(n-1)/2 次比较，时间复杂度为 O(n²)，这是最坏的情况。
 * 给定的数组杂乱无章。在这种情况下，平均时间复杂度 O(n²)。
 * 因此，时间复杂度是 O(n²)，这是一种稳定的排序算法。
 *
 * 稳定是指，两个相等的数，在排序过后，相对位置保持不变。
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }


    /**
     * 冒泡排序算法
     * @param array
     */
    public static void bubbleSort(int[] array){

        //若数组为空或者长度小于等于1,就不用进行排序了
        if(array==null || array.length<=1){
            return;
        }
        int length = array.length;
        //外层循环
        for(int i=0;i<length;i++){
            for(int j=0;j<length-1-i;j++){

                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 冒泡算法2：
     *定义一个布尔变量 hasChange，用来标记每轮是否进行了交换。在每轮遍历开始时，将 hasChange 设置为 false。
     * 若当轮没有发生交换，说明此时数组已经按照升序排列，hashChange 依然是为 false。此时外层循环直接退出，排序结束。
     * @param nums
     */
    private static void bubbleSort2(int[] nums) {
        boolean hasChange = true;
        for (int i = 0, n = nums.length; i < n - 1 && hasChange; ++i) {
            hasChange = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
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
