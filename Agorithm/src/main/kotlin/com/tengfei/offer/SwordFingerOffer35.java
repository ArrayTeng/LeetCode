package com.tengfei.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 35. 复杂链表的复制
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 */
public class SwordFingerOffer35 {

    //第一种解法：Hash表映射法
    public RandomListNode copyRandomList01(RandomListNode head) {
        //定义一个Map映射集合，key为原始Node,value为copy出来的Node
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode curr = head;
        while(curr!=null){
            map.put(curr,new RandomListNode(curr.val));
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

    public class RandomListNode {
        public int val;
        public RandomListNode next;
        public RandomListNode random;

        RandomListNode(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
