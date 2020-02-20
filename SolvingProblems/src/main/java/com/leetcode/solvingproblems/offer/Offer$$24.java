package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.ListNode;

/**
 * @author by tengfei on 2020/2/20.
 * @description：
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *  
 * <p>
 * 限制：
 * 0 <= 节点个数 <= 5000
 */
public class Offer$$24 {

    public static ListNode reverseList(ListNode head) {
        return reverse(head);
    }

    private static ListNode reverse(ListNode head){
        if (head == null||head.next == null) return head;

        ListNode temp = head.next;

        ListNode newNode = reverseList(head.next);
        temp.next = head;
        head.next = null;
        return newNode;

    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        ListNode listNode = new ListNode(array);

        ListNode newNode = reverse(listNode);

        System.out.println(newNode.toString());
    }
}
