package com.tengfei.offer;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class SwordFingerOffer53_2 {

    public int missingNumber(int[] nums) {
        int i =0;
        int j = nums.length-1;
        while(i<=j){
            int middle = i+(j-i)/2;
            if (nums[middle] == middle){
                i=middle+1;
            }else{
                j = middle-1;
            }

        }

        return i;
    }
}
