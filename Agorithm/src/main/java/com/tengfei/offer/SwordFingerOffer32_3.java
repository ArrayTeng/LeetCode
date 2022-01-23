package com.tengfei.offer;

import com.tengfei.util.TreeNode;

import java.util.*;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 */
public class SwordFingerOffer32_3 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> listOuter = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 0;
        while(!queue.isEmpty()){
            List<Integer> listInner = new ArrayList<>();
            int size = queue.size();
            for(int i =0;i<size;i++){
                TreeNode node = queue.poll();
                listInner.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            if(index%2 != 0){
                Collections.reverse(listInner);
            }
            index++;

            listOuter.add(listInner);
        }
        return listOuter;
    }


}
