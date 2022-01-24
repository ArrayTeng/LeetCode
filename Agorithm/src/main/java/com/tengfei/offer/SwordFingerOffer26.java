package com.tengfei.offer;

import com.tengfei.util.TreeNode;

/**
 * 剑指 Offer 26. 树的子结构
 * https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 */
public class SwordFingerOffer26 {

    public static void main(String[] args) {

    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A!=null &&B!=null) && (recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));
    }

    private boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return recur(A.left,B.left)&&recur(A.right,B.right);
    }
}
