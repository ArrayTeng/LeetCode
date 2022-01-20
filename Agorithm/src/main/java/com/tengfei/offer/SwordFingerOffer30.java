package com.tengfei.offer;

import java.util.Stack;

/**
 * 剑指 Offer 30. 包含min函数的栈
 * https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
public class SwordFingerOffer30 {

    private Stack<Integer> stackFirst = new Stack<>();
    private Stack<Integer> stackSecond = new Stack<>();

    public SwordFingerOffer30() {

    }

    public void push(int x) {
        stackFirst.push(x);
        if (stackSecond.isEmpty() || stackSecond.peek() >= x) {
            stackSecond.push(x);
        }
    }

    public void pop() {
        if (stackFirst.pop().equals(stackSecond.peek())){
            stackSecond.pop();
        }
    }

    public int top() {
        return stackFirst.peek();
    }

    public int min() {
        return stackSecond.peek();
    }
}
