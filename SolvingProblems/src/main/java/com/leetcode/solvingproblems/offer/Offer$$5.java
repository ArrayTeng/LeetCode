package com.leetcode.solvingproblems.offer;

/**
 * @author by tengfei on 2020/2/21.
 * @description： 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * <p>
 */
public class Offer$$5 {

    private StringBuilder builder = new StringBuilder();

    public String replaceSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item == ' ') {
                builder.append("%20");
            } else {
                builder.append(item);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Offer$$5 offer$$5 = new Offer$$5();
        String s = offer$$5.replaceSpace("Hello World");
        System.out.println(s);

    }
}
