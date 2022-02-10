package com.tengfei.offer;

import com.tengfei.util.ListNode;

/**
 * 剑指 Offer 18. 删除链表的节点
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class SwordFingerOffer18 {

    public ListNode deleteNode(ListNode head, int val) {
        if (head!=null && head.val == val){
            return head.next;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur!=null && cur.val!=val){
            pre = cur;
            cur = cur.next;
        }
        if (cur!=null){
            pre.next = cur.next;
        }
        return head;
    }
}
