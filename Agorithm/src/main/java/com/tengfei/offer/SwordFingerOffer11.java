package com.tengfei.offer;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class SwordFingerOffer11 {

    public static void main(String[] args) {

    }

    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int middle = i + (j - i) / 2;
            if (numbers[middle] > numbers[j]) {
                i = middle + 1;
            } else if (numbers[middle] < numbers[j]) {
                j = middle;
            } else {
                j--;
            }
        }
        return numbers[i];
    }
}
