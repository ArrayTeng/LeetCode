package com.leetcode.solvingproblems.easy;

/**
 * @author by tengfei on 2020/2/19.
 * @description： 删除链表中等于给定值 val 的所有节点。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class LeetCode$$203 {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while (prev.next != null) {
            ListNode currentNode = prev.next;
            if (currentNode.val == val) {
                prev.next = currentNode.next;
                currentNode.next = null;
            } else {
                prev = prev.next;
            }
        }

        return  dummyNode.next;
    }


    public static void main(String[] args) {

    }
}
