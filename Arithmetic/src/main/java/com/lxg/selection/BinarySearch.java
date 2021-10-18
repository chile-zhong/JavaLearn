package com.lxg.selection;

/**
 * @author lxg
 * @description 二分查找法
 * @date 2021/9/8
 *
 * 二分的本质并非“单调性”，而是“边界”，只要找到某种性质，使得整个区间一分为二，
 * 那么就可以用二分把边界点二分出来。
 *
 * 使用二分查找法的前提是：有序
 * 只有有序才能使用二分查找法
 */
public class BinarySearch {

    /**
     * 整数二分查找法的模板
     */
    //检查x是否满足某种性质
    boolean check(int x){
        return true;
    }

    /** 区间[left, right]被划分成[left, mid]和[mid + 1, right]时使用 */
    int binarySearch1(int left, int right) {
        while (left < right) {
            int mid = (left + right) >> 1;  //右移一位等价于除以二
            if (check(mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    /** 区间[left, right] 被划分成[left, mid - 1]和[mid, right]时使用 */
    int binarySearch2(int left, int right) {
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (check(mid)) left = mid;
            else right = mid - 1;
        }
        return left;
    }

    /*********************例题**********************/
    /*
    *
    * - 在排序数组中查找元素的第一个和最后一个位置
    * - x 的平方根
    * - 寻找峰值
    * - 第一个错误的版本
    * - 不动点
    * */

}
