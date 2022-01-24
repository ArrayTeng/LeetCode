package com.tengfei.offer;

import com.tengfei.util.TreeNode;

/**
 * 剑指 Offer 28. 对称的二叉树
 * https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 */
public class SwordFingerOffer28 {

    //递归的方式
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return recur(root.left,root.right);
    }

    private boolean recur(TreeNode leftNode,TreeNode rightNode){
        if(leftNode == null && rightNode == null){
            return true;
        }
        if(leftNode == null || rightNode == null || leftNode.val!=rightNode.val){
            return false;
        }
        return recur(leftNode.left,rightNode.right)&& recur(leftNode.right,rightNode.left);
    }

}
