package com.leetcode.solvingproblems.offer;

import java.util.Arrays;

/**
 * @author by tengfei on 2020/2/23.
 * @description：
 */
public class Offer$$39 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
