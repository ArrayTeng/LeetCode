package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.ListNode;

/**
 * @author by tengfei on 2020/2/21.
 * @description： 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * <p>
 * 返回链表 4->5.
 * <p>
 */
public class Offer$$22 {

    private int index = 0;

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        ListNode node = getKthFromEnd(head.next, k);
        index++;
        if (index == k) {
            return head;
        }

        return node;

    }

    /**
     * 第二种解法，快慢指针法
     */
    public ListNode getKthFromEnd2(ListNode head, int k) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode low = head;

        while (fast != null) {
            fast = fast.next;

            if (k == 0) {
                low = low.next;
            } else {
                k--;
            }
        }
        return low;

    }


    public static void main(String[] args) {
        Offer$$22 offer$$22 = new Offer$$22();

        int[] array = {1, 5, 4, 6, 3, 6, 4, 6, 7, 8};
        ListNode node = new ListNode(array);
        ListNode ret = offer$$22.getKthFromEnd(node, 4);
        System.out.println(ret.toString());

    }
}
