package com.leetcode.solvingproblems.offer;


import com.leetcode.solvingproblems.ListNode;

/**
 * @author by tengfei on 2020/2/19.
 * @description： 面试题18. 删除链表的节点
 * 可以使用常规遍历链表的方式，也可以使用递归的方式，这里要求使用递归
 */

public class Offer$$18 {

    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;

        head.next = deleteNode(head.next, val);

        return head.val == val ? head.next : head;
    }


    public static void main(String[] args) {
        int[] array = {1,5,4,6,3,6,4,6,7,8};
        ListNode node = new ListNode(array);
        ListNode res = deleteNode(node,4);
        System.out.println(res.toString());
    }


}

