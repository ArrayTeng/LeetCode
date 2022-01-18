package com.tengfei.leetcode

/**
 * 977. 有序数组的平方
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * 题解：https://programmercarl.com/0977.%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9.html#%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95
 */

fun sortedSquares(nums: IntArray): IntArray {
    var left = 0
    var right = nums.size - 1
    var dynamicArray = IntArray(nums.size,{0})
    var index = dynamicArray.size - 1
    while (left <= right){
        if(nums[right] * nums[right] > nums[left]*nums[left]){
            dynamicArray[index--] = nums[right] * nums[right]
            right--
        }else{
            dynamicArray[index--] = nums[left] * nums[left]
            left++
        }
    }
    return dynamicArray
}