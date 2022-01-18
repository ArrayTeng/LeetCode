package com.tengfei.leetcode

/**
 * 209.长度最小的子数组
 * 滑动窗口
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 * 题解：https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html#_209-%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84
 */
fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var result = Int.MAX_VALUE
    //滑动窗口的起始位置
    var start = 0
    //计算的值的总和
    var sum = 0
    //滑动窗口的长度
    var subLength = 0
    //循环遍历数组
    for ((index,element) in nums.withIndex()){
        sum+=element
        while (sum >= target){
            subLength = (index - start +1)
            result = if (result<subLength) result else subLength
            sum-=nums[start++]
        }
    }
    return if (result == Int.MAX_VALUE) 0 else result
}