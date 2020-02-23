package com.leetcode.solvingproblems.offer;

import java.lang.reflect.Parameter;

/**
 * @author by tengfei on 2020/2/22.
 * @description： 二叉搜索树的后序遍历序列，对于后序遍历而言，
 * 如果该数组是某一个二分搜索树的后序遍历的结果，那么数组的最后一个数据是二叉树的根结点
 */
public class Offer$$33 {

    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length <= 2) return true;
        //获取当前根结点下标
        int rootIndex = postorder.length - 1;
        return verifyPostorder(postorder, 0, rootIndex);
    }


    private boolean verifyPostorder(int[] postorder, int start, int end) {
        if (start >= end) return true;
        int i;
        for (i = start; i < end; i++) {
            if (postorder[i] > postorder[end]) {
                // 这时候已经找到了当前根节点的右子树的第一个结点
                break;
            }
        }

        //对于二分搜索树而言，右子树肯定大于根结点
        for (int j = i; j < end; j++) {
            if (postorder[j] < postorder[end]) return false;
        }

        return verifyPostorder(postorder, start, i - 1) && verifyPostorder(postorder, i, end - 1);

    }


    public static void main(String[] args) {

    }


}
