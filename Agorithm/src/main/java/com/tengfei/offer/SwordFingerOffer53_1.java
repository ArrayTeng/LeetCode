package com.tengfei.offer;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 *
 */
public class SwordFingerOffer53_1 {

    public static void main(String[] args) {
        int[] nums = {2,2};
        SwordFingerOffer53_1 swordFingerOffer53_1 = new SwordFingerOffer53_1();
        int res = swordFingerOffer53_1.search(nums,3);
        System.out.println("res = "+res);
    }


    public int search(int[] nums, int target) {
        //左边界
        int left = leftBorder(nums,target);
        //右边界
        int right = rightBorder(nums,target);
        System.out.println("左边界："+left+"右边界："+right);
        if (right > left && right <= nums.length && nums[left+1]==target && nums[right-1]==target){
            return right - left - 1;
        }
        return  0;
    }

    //查找左边界
    private int leftBorder(int[] nums, int target){
        int leftBorder = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int middle = left+(right - left)/2;
            if (target<=nums[middle]){
                right = middle - 1;
                leftBorder = right;
            }else{
                left = middle+1;
            }
        }
        return leftBorder;
    }

    //查找右边界
    private int rightBorder(int[] nums, int target){
        int rightBorder = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int middle = left+(right-left)/2;
            if(target >= nums[middle]){
                left = middle+1;
                rightBorder = left;
            }else {
                right = middle - 1;
            }
        }
        return rightBorder;
    }

}
