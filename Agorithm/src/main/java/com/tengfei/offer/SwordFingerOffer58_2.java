package com.tengfei.offer;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class SwordFingerOffer58_2 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = n; i < (n + s.length()); i++) {
            builder.append(s.charAt(i%(s.length())));
        }
        return builder.toString();
    }
}
