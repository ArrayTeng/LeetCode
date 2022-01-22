package com.tengfei.offer;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 */
public class SwordFingerOffer50 {

    public static void main(String[] args) {

    }

    public char firstUniqChar(String s) {
        LinkedHashMap<Character, Boolean> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (Character c : chars){
            map.put(c,!map.containsKey(c));
        }

        for (Map.Entry<Character, Boolean> entry : map.entrySet()){
            if (entry.getValue()){
                return entry.getKey();
            }
        }

        return ' ';
    }
}
