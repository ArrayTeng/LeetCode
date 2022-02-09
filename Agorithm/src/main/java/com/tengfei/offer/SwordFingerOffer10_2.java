package com.tengfei.offer;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 */
public class SwordFingerOffer10_2 {

    public int numWays(int n) {
        int a = 1;
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
