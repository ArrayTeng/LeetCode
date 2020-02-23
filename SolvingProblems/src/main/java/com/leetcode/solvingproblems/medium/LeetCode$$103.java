package com.leetcode.solvingproblems.medium;

import com.leetcode.solvingproblems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author by tengfei on 2020/2/22.
 * @description：   二叉树的锯齿形层次遍历
 */
@SuppressWarnings("ALL")
public class LeetCode$$103 {

    private int level = 0;

    private List<List<Integer>> resList = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return resList;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            resList.add(new ArrayList<>());
            int size = queue.size();
            for (int i = 0;i<size;i++){
                TreeNode curNode = queue.remove();
                if (level%2 == 0){
                    //偶数以及0
                    resList.get(level).add(curNode.val);
                }else {
                    //奇数
                    resList.get(level).add(0,curNode.val);
                }

                if (curNode.left!=null){
                    queue.add(curNode.left);
                }

                if (curNode.right!=null){
                    queue.add(curNode.right);
                }
            }

            level++;

        }

        return resList;
    }
}
