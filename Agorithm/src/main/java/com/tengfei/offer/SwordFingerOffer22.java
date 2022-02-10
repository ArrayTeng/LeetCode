package com.tengfei.offer;

import com.tengfei.util.ListNode;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class SwordFingerOffer22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;
        for (int i = 0;i<k;i++){
            former = former.next;
        }
        while(former!=null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

}
