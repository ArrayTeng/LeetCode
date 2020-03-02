package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author by tengfei on 2020/3/2.
 * @description：
 */
public class Offer$$54 {

    private List<Integer> list = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
        inOrder(root, list);
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                return list.get(i);
            }
        }
        return -1;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inOrder(root.right, list);
        //System.out.println(root.val);
        list.add(root.val);
        inOrder(root.left, list);
    }
}
