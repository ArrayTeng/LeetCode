package com.tengfei.offer;

import com.tengfei.util.ListNode;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 */
public class SwordFingerOffer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while(nodeA != nodeB){
            nodeA = nodeA!=null?nodeA.next:headB;
            nodeB = nodeB!=null?nodeB.next:headA;
        }
        return nodeA;
    }
}
