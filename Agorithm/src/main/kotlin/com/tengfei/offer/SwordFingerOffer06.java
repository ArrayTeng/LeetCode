package com.tengfei.offer;

import com.tengfei.util.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class SwordFingerOffer06 {

    private final List<Integer> list = new ArrayList<>();

    //第一种解法：使用Stack
    public int[] reversePrint01(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] array = new int[size];
        for (int i = 0;i<size;i++){
            array[i] = stack.pop();
        }
        return array;
    }

    //第二种解法：使用递归
    public int[] reversePrint02(ListNode head) {
        reverse(head);
        int[] res = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private void reverse(ListNode head){
        if (head == null) return;
        reverse(head.next);
        list.add(head.val);
    }

}
