package com.leetcode.solvingproblems.offer;

import java.util.Arrays;

/**
 * @author by tengfei on 2020/3/2.
 * @description： 面试题40. 最小的k个数,题目看起来很简单，但这里有个堆的概念，可以尝试使用堆来使用
 */
public class Offer$$40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k > arr.length) return new int[]{};
        Arrays.sort(arr);
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = arr[i];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,4,3,20,9,6};

        Offer$$40 offer$$40 = new Offer$$40();
        int[] res = offer$$40.getLeastNumbers(array,3);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }
}
