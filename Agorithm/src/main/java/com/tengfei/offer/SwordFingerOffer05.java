package com.tengfei.offer;

/**
 * 剑指 Offer 05. 替换空格
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */
public class SwordFingerOffer05 {

    //第一种解法：直接使用StringBuilder
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : s.toCharArray()){
            if (c == ' '){
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}
