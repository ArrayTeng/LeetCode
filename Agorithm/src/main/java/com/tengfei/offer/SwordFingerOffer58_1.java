package com.tengfei.offer;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 * https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 */
public class SwordFingerOffer58_1 {

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        int i = s.length() - 1,j = i;
        while(i>=0){
            while(i>=0 && s.charAt(i)!= ' '){
                i--;
            }
            stringBuilder.append(s.substring(i+1,j+1)+" ");
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            j = i;
        }
        return stringBuilder.toString().trim();
    }
}
