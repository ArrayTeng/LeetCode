package com.tengfei.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class SwordFingerOffer03 {

    //通过Map对比key的方式
    public int findRepeatNumber01(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return nums[i];
            }else{
                map.put(nums[i],i);
            }

        }
        return -1;
    }

    //原地置换法
    public int findRepeatNumber02(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if (nums[i] == i){
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]){
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
