package com.tengfei.offer;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
public class SwordFingerOffer09 {

    private Stack<Integer> stackFirst = new Stack<>();

    private Stack<Integer> stackSecond = new Stack<>();

    public SwordFingerOffer09() {

    }

    public void appendTail(int value) {
        stackFirst.push(value);
    }

    public int deleteHead() {
        if (stackSecond.isEmpty()) {
            while (!stackFirst.isEmpty()) {
                stackSecond.push(stackFirst.pop());
            }
        }
        if (stackSecond.isEmpty()){
            return -1;
        }
        return  stackSecond.pop();

    }

}
