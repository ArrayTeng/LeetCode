package com.leetcode.solvingproblems.offer;

/**
 * @author by tengfei on 2020/3/2.
 * @description：
 */
public class Offer$$58_2 {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }

    public static void main(String[] args) {
        Offer$$58_2 offer$$58_2 = new Offer$$58_2();
        String s =offer$$58_2.reverseLeftWords("abcdefg",2);
        System.out.println(s);
    }
}
