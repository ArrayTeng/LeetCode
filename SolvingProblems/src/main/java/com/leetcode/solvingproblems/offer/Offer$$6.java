package com.leetcode.solvingproblems.offer;

import java.text.SimpleDateFormat;
import java.util.Stack;

/**
 * @author by tengfei on 2020/2/19.
 * @description： 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2] 输出：[2,3,1]
 */
public class Offer$$6 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int[] reversePrint(ListNode head) {
        ListNode prevNode = head;
        Stack<Integer> stack = new Stack<>();
        int length = 0;
        while (prevNode!=null){
            length++;
            stack.push(prevNode.val);
            prevNode = prevNode.next;
        }

        int[] items = new int[length];

        for (int i=0;i<length;i++){
            Integer integer = stack.pop();
            items[i] = integer;
        }

        return items;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        int[] items = reversePrint(node);
        System.out.println(items);
    }
}
