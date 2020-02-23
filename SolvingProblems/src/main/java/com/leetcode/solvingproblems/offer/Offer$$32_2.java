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
public class Offer$$32_2 {


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();

        if (root == null) return resList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                innerList.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            resList.add(new ArrayList<>(innerList));
            innerList.clear();

        }

        return resList;

    }
}
