package com.lxg.selection;

/**
 * @author lxg
 * @description 不动点
 * @date 2021/9/9
 *
 * 题目描述
 * 给定已经按 升序 排列、由不同整数组成的数组 arr，返回满足 arr[i] == i 的最小索引 i。如果不存在这样的 i，返回 -1。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [-10,-5,0,3,7]
 * 输出：3
 * 解释：对于给定的数组，arr[0] = -10，arr[1] = -5，arr[2] = 0，arr[3] = 3，因此输出为 3 。
 * 示例 2：
 *
 * 输入：arr = [0,2,5,8,17]
 * 输出：0
 * 解释：arr[0] = 0，因此输出为 0 。
 * 示例 3：
 *
 * 输入：arr = [-10,-5,3,4,7,9]
 * 输出：-1
 * 解释：不存在这样的 i 满足 arr[i] = i，因此输出为 -1 。
 *
 *
 * 提示：
 *
 * 1 <= arr.length < 104
 * -109 <= arr[i] <= 109
 *
 *
 * 进阶：时间复杂度为 O(n) 的解决方案很直观也很简单。你可以设计更优的解决方案吗？
 *
 * 解法
 * 二分查找。
 */
public class FixedPoint {


    public int fixedPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (arr[mid] >= mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left] == left ? left : -1;
    }
}
