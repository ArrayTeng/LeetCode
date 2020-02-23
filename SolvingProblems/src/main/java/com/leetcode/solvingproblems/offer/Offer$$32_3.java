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
@SuppressWarnings("Duplicates")
public class Offer$$32_3 {

    //记录当前树的深度
    private int index = 0;

    private Queue<TreeNode> queue = new LinkedList<>();
    private List<List<Integer>> resList = new ArrayList<>();
    private List<Integer> innerList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) return resList;

        queue.add(root);

        while (!queue.isEmpty()) {
            resList.add(innerList);
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.remove();
                if (index % 2 == 0) {
                    resList.get(index).add(currNode.val);
                } else {
                    resList.get(index).add(0, currNode.val);
                }

                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
            index++;


        }

        return resList;
    }

}
