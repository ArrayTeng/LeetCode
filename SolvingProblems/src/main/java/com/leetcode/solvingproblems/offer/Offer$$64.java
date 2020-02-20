package com.leetcode.solvingproblems.offer;

/**
 * @author by tengfei on 2020/2/20.
 * @description： 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: n = 3
 * 输出: 6
 * 示例 2：
 * <p>
 * 输入: n = 9
 * 输出: 45
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qiu-12n-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer$$64 {

    public static int sumNums(int n) {
        return sum(n,1);
    }

    private static int sum(int n, int index) {
        if (index > n) return 0;
        return index + sum(n,index+1);
    }

    public static void main(String[] args) {
        int n = sumNums(5);
        System.out.println(n);
    }

}
