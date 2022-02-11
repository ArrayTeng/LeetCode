package com.tengfei.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 57. 和为s的两个数字
 */
public class SwordFingerOffer57 {

    //第一种 - 超出了时间限制
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
             int temp = target - nums[i];
             if (map.containsValue(temp)){
                 return new int[]{temp,nums[i]};
             }else {
                 map.put(i,nums[i]);
             }
        }
        return new int[]{};
    }

    //第二种
    public int[] twoSum2(int[] nums, int target) {
        int i =0;
        int j = nums.length - 1;
        while (i<j){
            int result = nums[i]+nums[j];
            if (result > target){
                j--;
            }else if (result<target){
                i++;
            }else{
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[]{};
    }

}
