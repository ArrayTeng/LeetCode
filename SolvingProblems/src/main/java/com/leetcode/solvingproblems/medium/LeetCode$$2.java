package com.leetcode.solvingproblems.medium;

/**
 * @author tengfei
 *         LeetCode 2
 *         <p>
 *         链表反转
 */
public class LeetCode$$2 {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode listNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = listNode;
        }
        return prev;
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
