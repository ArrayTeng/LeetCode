package com.tengfei.offer;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
public class SwordFingerOffer10_1 {

    public int fib(int n) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 0;i<n;i++){
            sum = (a+b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}
