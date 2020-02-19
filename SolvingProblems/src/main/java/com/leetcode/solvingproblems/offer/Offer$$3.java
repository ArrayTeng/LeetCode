package com.leetcode.solvingproblems.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by tengfei on 2020/2/19.
 * @description： 面试题03. 数组中重复的数字
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的
 * ，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class Offer$$3 {

    public static int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        Map<Integer, Integer> mMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mMap.get(nums[i]) == null) {
                mMap.put(nums[i], i);
            } else {
                return nums[i];
            }
        }

        return -1;
    }

    /**
     * 第二种解法，一个萝卜一个坑，注意审题， nums 里的所有数字都在 0～n-1 的范围内
     * 参考 https://blog.csdn.net/weixin_41163113/article/details/87863826
     */
    public static int findRepeatNumber$$02(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0 || nums[i] >= length) return -1;

            while (nums[i] != i) {
                //如果这个元素与以这个元素值为下标的元素相等（元素本应该在的位置），则说明这个元素重复了
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }else {
                    //获取这个元素值，并与以这个元素值为下标的元素互换
                    int temp = nums[i];
                    nums[i] = nums[temp];
                    nums[temp] = temp;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 6, 3, 8, 1, 9};
        int item = findRepeatNumber$$02(nums);
        System.out.println(item);
    }
}
