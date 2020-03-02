package com.leetcode.solvingproblems.easy;


import com.leetcode.solvingproblems.ListNode;

import java.beans.FeatureDescriptor;

/**
 * @author by tengfei on 2020/3/2.
 * @description： 反转一个单链表, 考虑两种解答方式，1 原地反转法，2 递归方案
 */
public class LeetCode$$206 {

    private ListNode prev, curr;

    /**
     * 原地反转法
     */
    public ListNode reverseListNo1(ListNode head) {
        prev = null;
        curr = head;
        while (curr != null) {
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;

        }
        return prev;
    }

    /**
     * 递归
     */
    public ListNode reverseListNo2(ListNode head) {

        return reverseNode(head);
    }

    private ListNode reverseNode(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode node = reverseNode(head.next);

        head.next.next = head;
        head.next = null;

        return node;

    }


    public static void main(String[] args) {
        LeetCode$$206 leetCode$$206 = new LeetCode$$206();
        int[] array = {1, 2, 3, 4, 5};
        ListNode listNode = new ListNode(array);
        ListNode res = leetCode$$206.reverseListNo2(listNode);
        System.out.println(res.toString());
    }
}
