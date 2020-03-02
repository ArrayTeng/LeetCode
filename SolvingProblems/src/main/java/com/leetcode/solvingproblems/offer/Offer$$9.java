package com.leetcode.solvingproblems.offer;

import java.util.Stack;

/**
 * @author by tengfei on 2020/2/21.
 * @description： 用两个栈实现队列
 */
public class Offer$$9 {


    private static class CQueue {

        private Stack<Integer> stackA;
        private Stack<Integer> stackB;
        private int size = 0;

        public CQueue() {
            stackA = new Stack<>();
            stackB = new Stack<>();
            size = 0;
        }

        public void appendTail(int value) {
            while (!stackA.empty()){
                stackB.push(stackA.pop());
            }
            stackA.push(value);
            size++;
            while (!stackB.empty()){
                stackA.push(stackB.pop());
            }
        }

        public int deleteHead() {
            if (size == 0){
                return -1;
            }

            size--;
            return stackA.pop();
        }
    }


}
