package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.TreeNode;

/**
 * @author by tengfei on 2020/2/23.
 * @description： 二叉树的镜像
 */
public class Offer$$27 {


    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;

    }


}
