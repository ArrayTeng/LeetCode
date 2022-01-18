package com.tengfei.leetcode

/**
 * 27. 移除元素
 */
fun removeElement(nums: IntArray, `val`: Int): Int {
    var showIndex = 0
    for((index,element) in nums.withIndex()){
        if(`val`!=element){
            nums[showIndex++] = element
        }
    }
    return  showIndex
}

