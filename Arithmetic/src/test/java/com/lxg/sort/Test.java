package com.lxg.sort;


import java.util.Arrays;

/**
 * @author lxg
 * @description 排序算法测试类
 * @date 2021/9/7
 */
public class Test {

    /*测试排序算法*/
    @org.junit.Test
    public void sortArithmeticTest(){
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        // 只需要修改成对应的方法名就可以了
        //SortArithmetic.bubbleSort(array);

        //SortArithmetic.selectionSort(array);

        //SortArithmetic.insertionSort(array);

        SortArithmetic.shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
