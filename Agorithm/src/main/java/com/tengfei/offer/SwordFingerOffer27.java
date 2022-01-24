package com.tengfei.offer;

import com.tengfei.util.TreeNode;

import java.util.Stack;

/**
 * 剑指 Offer 27. 二叉树的镜像
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 */
public class SwordFingerOffer27 {

    //第一种方式Stack辅助栈
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node.left!=null){
                stack.add(node.left);
            }
            if(node.right!=null){
                stack.add(node.right);
            }
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }
}
