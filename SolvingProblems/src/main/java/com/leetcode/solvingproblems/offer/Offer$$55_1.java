package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


/**
 * @author by tengfei on 2020/2/23.
 * @description： 二叉树的深度
 */
public class Offer$$55_1 {

    private int index;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.remove();
                if (curNode.left != null) queue.add(curNode.left);
                if (curNode.right != null) queue.add(curNode.right);
            }

            index++;
        }

        return index;
    }


}
