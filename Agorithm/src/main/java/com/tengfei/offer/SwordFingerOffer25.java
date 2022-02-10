package com.tengfei.offer;

import com.tengfei.util.ListNode;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 */
public class SwordFingerOffer25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dynamic = new ListNode(0);
        ListNode cur = dynamic;
        while(l1!=null && l2!=null){
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 !=null ? l1:l2;
        return dynamic.next;
    }

}
