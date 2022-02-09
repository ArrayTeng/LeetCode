package com.tengfei.offer;

/**
 * 剑指 Offer 63. 股票的最大利润
 */
public class SwordFingerOffer63 {
    int cost = Integer.MAX_VALUE;
    int profit = 0;
    public int maxProfit(int[] prices) {
        for(int price : prices){
            cost = Math.min(cost,price);
            profit = Math.max(profit,price - cost);
        }
        return profit;
    }
}
