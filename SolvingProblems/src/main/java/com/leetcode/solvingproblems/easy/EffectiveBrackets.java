package com.leetcode.solvingproblems.easy;

import java.util.Stack;

/**
 * @author by tengfei on 2020/2/18.
 * @description： leetcode 20
 */
public class EffectiveBrackets {


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                char topChar = stack.pop();
                if (topChar == '(' && c != ')') return false;
                if (topChar == '[' && c != ']') return false;
                if (topChar == '{' && c != '}') return false;
            }
        }
        return stack.empty();
    }


    public static void main(String[] args) {
        EffectiveBrackets effectiveBrackets = new EffectiveBrackets();
        boolean isValid = effectiveBrackets.isValid("{[(]}");
        System.out.println(isValid);
    }

}
