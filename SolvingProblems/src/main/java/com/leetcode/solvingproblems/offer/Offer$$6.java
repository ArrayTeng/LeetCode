package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.ListNode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author by tengfei on 2020/2/19.
 * @description： 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2] 输出：[2,3,1]
 */
public class Offer$$6 {


    public static int[] reversePrint(ListNode head) {
        ListNode prevNode = head;
        Stack<Integer> stack = new Stack<>();
        int length = 0;
        while (prevNode != null) {
            length++;
            stack.push(prevNode.val);
            prevNode = prevNode.next;
        }

        int[] items = new int[length];

        for (int i = 0; i < length; i++) {
            Integer integer = stack.pop();
            items[i] = integer;
        }

        return items;
    }

    /**
     * 通过递归的方式解答
     */
    private static List<Integer> tempList = new ArrayList<>();

    private static int[] reversePrintByRecursion(ListNode head) {
        recursion(head);
        int length = tempList.size();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[length - 1 - i] = tempList.get(i);
        }
        return array;
    }

    private static void recursion(ListNode head) {
        if (head == null) return;
        tempList.add(head.val);
        recursion(head.next);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        ListNode node = new ListNode(array);
        int[] res = reversePrintByRecursion(node);
        for (int i:res){
            System.out.println(i);
        }
    }
}
