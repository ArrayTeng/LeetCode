package com.tengfei.leetcode

/**
 * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
fun searchRange(nums: IntArray, target: Int): IntArray {
    var leftBorder = getLeftBorder(nums,target)
    var rightBorder = getRightBorder(nums,target)
    if(leftBorder == -2 || rightBorder == -2){
        return intArrayOf(-1,-1)
    }
    if(rightBorder - leftBorder > 1){
        return intArrayOf(leftBorder+1,rightBorder-1)
    }
    return intArrayOf(-1,-1)
}

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
fun getRightBorder(nums: IntArray, target: Int):Int{
    var left = 0
    var right = nums.size - 1
    var rightBorder = -2;
    while (left <= right){
        var middle = left+((right - left)/2)
        if (nums[middle] > target ){
            right = middle - 1
        }else{
            left = middle +1
            rightBorder = left
        }
    }
    return rightBorder
}

fun getLeftBorder(nums: IntArray, target: Int):Int{
    var left = 0
    var right = nums.size - 1
    var leftBorder = -2;
    while (left <= right){
        var middle = left+((right - left)/2)
        if (nums[middle] >= target ){
            right = middle - 1
            leftBorder = right
        }else{
            left = middle +1
        }
    }
    return leftBorder
}
