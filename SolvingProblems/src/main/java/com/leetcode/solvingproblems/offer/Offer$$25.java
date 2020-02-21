package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.ListNode;
import com.sun.deploy.util.ParameterUtil;

/**
 * @author by tengfei on 2020/2/20.
 * @description： 合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * <p>
 * 示例1：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 1000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Offer$$25 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);

        ListNode prev = dummyNode;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;

        return dummyNode.next;
    }


    public static void main(String[] args) {
        ListNode firstNode = new ListNode(new int[]{1,3,5,8});
        ListNode secondNode = new ListNode(new int[]{2,4,6,9});
        ListNode listNode = mergeTwoLists(firstNode,secondNode);
        System.out.println(listNode.toString());
    }

}
