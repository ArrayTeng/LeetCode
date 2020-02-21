package com.leetcode.solvingproblems.offer;

/**
 * @author by tengfei on 2020/2/21.
 * @description： 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 *  
 * <p>
 * 说明：
 * <p>
 * 用返回一个整数列表来代替打印
 * n 为正整数
 * <p>
 */

public class Offer$$17 {

    //如果n为超大值该怎么办？


    public int[] printNumbers(int n) {
        int res = (int) (Math.pow(10, n)) - 1;
        int[] array = new int[res];
        for (int i = 0; i < res; i++) {
            array[i] = i+1;
        }
        return array;
    }

    public static void main(String[] args) {
        Offer$$17 offer$$17 = new Offer$$17();
        int[] array = offer$$17.printNumbers(2);
        for (int i:array){
            System.out.println(i);
        }
    }
}
