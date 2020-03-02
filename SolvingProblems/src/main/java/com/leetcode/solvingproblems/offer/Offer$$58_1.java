package com.leetcode.solvingproblems.offer;

/**
 * @author by tengfei on 2020/3/2.
 * @description：
 */
public class Offer$$58_1 {

    public String reverseWords(String s) {
        String[] currArray = s.trim().split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = currArray.length - 1; i >= 0; i--) {
            if (!currArray[i].equals("")){
                builder.append(currArray[i]);
                builder.append(" ");
            }

        }

        return builder.toString().trim();
    }

    public static void main(String[] args) {
        Offer$$58_1 offer$$58_1 = new Offer$$58_1();
        String res = offer$$58_1.reverseWords("the  sky is blue");
        System.out.println(res);
    }
}
