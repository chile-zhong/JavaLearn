package com.lxg.sort;

/**
 * @author lxg
 * @description 排序算法大全
 * @date 2021/9/7
 */
public class SortArithmetic {

    /*
    * 归并排序：
    *
    * */


    /*
    * 希尔排序：
    * 希尔排序是希尔（Donald Shell）于1959年提出的一种排序算法。希尔排序也是一种插入排序，它是简单插入排序经过改进之后的一个更高效的版本，
    * 也称为缩小增量排序，同时该算法是冲破O(n2）的第一批算法之一。它与插入排序的不同之处在于，它会优先比较距离较远的元素。
    * 希尔排序又叫缩小增量排序。
    * 希尔排序是把记录按下表的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，
    * 整个文件恰被分成一组，算法便终止。
    *
    * 算法描述：
    * 我们来看下希尔排序的基本步骤，在此我们选择增量gap=length/2，缩小增量继续以gap = gap/2的方式，这种增量选择我们可以用一个序列来表示，
    * {n/2,(n/2)/2…1}，称为增量序列。希尔排序的增量序列的选择与证明是个数学难题，
    * 我们选择的这个增量序列是比较常用的，也是希尔建议的增量，称为希尔增量，但其实这个增量序列不是最优的。此处我们做示例使用希尔增量。先
    *
    * 将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：
    * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
    * 按增量序列个数k，对序列进行k 趟排序；
    * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，
    * 整个序列作为一个表来处理，表长度即为整个序列的长度。
    * */
    public static void shellSort(int[] array){
        if(array == null || array.length <= 1){
            return;
        }

        int length = array.length;

        //temp为临时变量，gap增量默认是长度的一半，每次变为之前的一半，直到最终数组有序
        int temp;
        int gap = length/2;
        while(gap>0){

            // 将当前的数与减去增量之后位置的数进行比较，如果大于当前数，将它后移
            for(int i = gap;i<length;i++){
                temp = array[i];
                int preIndex = i-gap;
                while(preIndex >= 0 && array[preIndex]>temp){
                    array[preIndex+gap] = array[preIndex];
                    preIndex -= gap;
                }
                // 将当前数放到空出来的位置
                array[preIndex + gap] = temp;
            }
            gap = gap/2;
        }
    }


    /*
    * 插入排序：
    *  插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，
    *  在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），
    *  因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
    * 算法描述：
    *   一般来说，插入排序都采用in-place（即只需用到O(1)的额外空间的排序）在数组上实现。具体算法描述如下：
    *       从第一个元素开始，该元素可以认为已经被排序；
    *       取出下一个元素，在已经排序的元素序列中从后向前扫描；
    *       如果该元素（已排序）大于新元素，将该元素移到下一位置；
    *       重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
    *       将新元素插入到该位置后；
    *       重复步骤2~5。
    * */
    public static void insertionSort(int[] array){
        if(array == null || array.length <= 1){
            return;
        }
        //数组长度
        int length = array.length;

        //要插入的数
        int insertNum;

        for(int i =0;i<length;i++){
            insertNum = array[i];

            int j=i-1;
            //将已经排好序中大于需要插入的数据都往后移动一位
            while(j >= 0 && array[j] > insertNum ){
                array[j+1]=array[j];
                j--;
            }

            //将需要插入的数插入要插入的位置
            array[j+1] = insertNum;
        }
    }
    /*
    * 选择排序：
    * 表现最稳定的排序算法之一，因为无论什么数据进去都是O(n2)的时间复杂度，所以用到它的时候，数据规模越小越好。
    * 唯一的好处可能就是不占用额外的内存空间了吧。理论上讲，选择排序可能也是平时排序一般人想到的最多的排序方法了吧。
    * 选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序列中找到最小（大）元素，
    * 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
    *
    * 算法描述：
    *  n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下：
    *  初始状态：无序区为R[1…n]，有序区为空；
    *  第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1…i-1]和R(i…n）。该趟排序从当前无序区中-选出关键字最小的记录 R[k]，
    *  将它与无序区的第1个记录R交换，使R[1…i]和R[i+1…n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；n-1趟结束，数组有序化了。
    * */
    public static void selectionSort(int[] array){
        if (array==null || array.length<=1){
            return;
        }

        int length = array.length;
        for(int i=0;i<length-1;i++){

            int minIndex = i;
            for(int j=i+1;j<length;j++){
                //找到最小的数
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                swap(array, minIndex, i);
            }
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
    /*
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
    * */
    public static void bubbleSort(int[] array){
        if(array==null || array.length<=1){
            return;
        }
        int length = array.length;
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
}
