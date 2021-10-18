package com.lxg.sort;

import java.util.Arrays;

/**
 * @author lxg
 * @description 选择排序
 * @date 2021/9/8
 *
 * 选择排序：
 * 表现最稳定的排序算法之一，因为无论什么数据进去都是O(n2)的时间复杂度，所以用到它的时候，数据规模越小越好。
 * 唯一的好处可能就是不占用额外的内存空间了吧。理论上讲，选择排序可能也是平时排序一般人想到的最多的排序方法了吧。
 * 选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序列中找到最小（大）元素，
 * 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 *
 * 选择排序算法的实现思路有点类似插入排序，也分已排序区间和未排序区间。但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾。
 *
 * 算法描述：
 *  n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下：
 *  初始状态：无序区为R[1…n]，有序区为空；
 *  第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1…i-1]和R(i…n）。该趟排序从当前无序区中-选出关键字最小的记录 R[k]，
 *  将它与无序区的第1个记录R交换，使R[1…i]和R[i+1…n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；n-1趟结束，数组有序化了。
 *
 * 算法分析：
 * 空间复杂度 O(1)，时间复杂度 O(n²)。
 *
 * 那选择排序是稳定的排序算法吗？
 * 答案是否定的，选择排序是一种不稳定的排序算法。选择排序每次都要找剩余未排序元素中的最小值，并和前面的元素交换位置，这样破坏了稳定性。
 * 比如 5，8，5，2，9 这样一组数据，使用选择排序算法来排序的话，第一次找到最小元素 2，与第一个 5 交换位置，那第一个 5 和中间的 5 顺序就变了，
 * 所以就不稳定了。正是因此，相对于冒泡排序和插入排序，选择排序就稍微逊色了。
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }


    /**
     * 选择排序1
     * @param array
     */
    public static void selectionSort(int[] array){
        //如果数组为空或长度为1，不用排序
        if (array==null || array.length<=1){
            return;
        }
        //取数组长度
        int length = array.length;
        for(int i=0;i<length-1;i++){

            //标记最小元素下标
            int minIndex = i;
            //循环遍历查找无序区的最小值
            for(int j=i+1;j<length;j++){
                //找到最小的数
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            //将从无序区选择出来的值放到有序区末尾
            if(i!=minIndex){
                swap(array, minIndex, i);
            }
        }
    }

    /**
     * 选择排序2
     * @param nums
     */
    private static void selectionSort2(int[] nums) {
        for (int i = 0, n = nums.length; i < n - 1; ++i) {
            int minIndex = i;
            for (int j = i; j < n; ++j) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, minIndex, i);
        }
    }

    /**
     * 交换元素位置
     * @param array
     * @param a
     * @param b
     */
    public static void swap(int[] array,int a,int b){
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }
}
