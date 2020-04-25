package com.leetcode.solvingproblems.offerKotlin

import java.util.*

/**
 * @author by tengfei on 2020/4/25.
 * @description：面试题03. 数组中重复的数字
 *
 *
 *
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Offer03 {


    fun findRepeatNumber(nums: IntArray): Int {
        if (nums.isEmpty()) return -1

        for ((index, element) in nums.withIndex()) {

            if (nums[index] < 0 || nums[index] >= nums.size) return -1
            while (index != nums[index]) {
                if (nums[index] == nums[nums[index]]) {
                    return nums[index]
                } else {
                    val temp = nums[index]
                    nums[index] = nums[temp]
                    nums[temp] = temp
                }
            }
        }

        return -1
    }


    fun findRepeatNumber2(nums: IntArray): Int {
        if (nums.isEmpty()) return -1
        val map = HashMap<Int,Int>()

        for ((index, element) in nums.withIndex()) {

            if (nums[index] < 0 || nums[index] >= nums.size) return -1


            if(map[nums[index]] == null){
                map[nums[index]] = index
            }else{
                return nums[index]
            }


        }

        return -1
    }


}


fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(3, 3, 1, 0, 2, 5, 3)
    val offer03 = Offer03()
    val result = offer03.findRepeatNumber2(nums)
    println(result)
}