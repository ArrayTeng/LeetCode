package com.leetcode.solvingproblems.offer;

import com.leetcode.solvingproblems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author by tengfei on 2020/2/22.
 * @description：
 */
public class Offer$$32_1 {

    private List<Integer> list = new ArrayList<>();


    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.remove();
            list.add(curNode.val);
            if (curNode.left != null) {
                queue.add(curNode.left);
            }

            if (curNode.right != null) {
                queue.add(curNode.right);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            array[i] = list.get(i);
        }
        return array;
    }


}
