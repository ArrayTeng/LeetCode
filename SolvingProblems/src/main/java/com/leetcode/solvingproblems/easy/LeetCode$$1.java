package com.leetcode.solvingproblems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by tengfei on 2020/3/2.
 * @description：  两数之和
 */
public class LeetCode$$1 {

    private Map<Integer,Integer> map = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0;i<nums.length;i++){
           int complement = target - nums[i];
           if (map.containsKey(complement)){
               return new int[]{map.get(complement),nums[i]};
           }
           map.put(complement,nums[i]);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

    }
}
