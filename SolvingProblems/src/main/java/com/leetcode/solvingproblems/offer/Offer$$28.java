package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.TreeNode;

/**
 * @author by tengfei on 2020/2/24.
 * @description：
 */
public class Offer$$28 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode leftNode,TreeNode rightNode){
        if (leftNode == null && rightNode == null) return true;
        if (leftNode == null || rightNode == null) return false;
        return leftNode.val == rightNode.val&&isMirror(leftNode.left,rightNode.right)&&isMirror(leftNode.right,rightNode.left);
    }
}
