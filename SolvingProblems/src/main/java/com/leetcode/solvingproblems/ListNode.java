package com.leetcode.solvingproblems;

/**
 * @author by tengfei on 2020/2/20.
 * @description：
 */
public class ListNode {
   public int val;
   public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array can't null or length == 0");
        }

        this.val = array[0];
        ListNode cur = this;
        for (int i = 1; i < array.length; i++) {
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
