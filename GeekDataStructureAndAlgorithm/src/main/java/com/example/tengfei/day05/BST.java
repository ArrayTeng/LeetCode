package com.example.tengfei.day05;

import com.sun.org.glassfish.external.statistics.RangeStatistic;
import javafx.scene.transform.Rotate;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author by tengfei on 2020/2/21.
 * @description： 二分搜索树
 */
@SuppressWarnings("Duplicates")
public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        root = add(root, e);
    }

    //尝试从根结点开始插入元素E，对于递归算法而言第一步就是要看递归终止的条件
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else {
            node.right = add(node.right, e);
        }

        return node;

    }


    public boolean contains(E e) {
        return contains(root, e);
    }

    public boolean contains(Node node, E e) {
        if (node == null) return false;

        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }

    }

    public Node removeMin() {
        Node result = minimum(root);
        root = removeMin(root);
        return result;
    }

    private Node removeMin(Node root) {
        if (root.left == null) {
            Node rightNode = root.right;
            root.right = null;
            size--;
            return rightNode;
        }

        root.left = removeMin(root.left);
        return root;
    }


    public Node removeMax() {
        Node result = minimum(root);
        root = removeMax(root);
        return result;
    }

    private Node removeMax(Node root) {
        if (root.right == null) {
            Node leftNode = root.left;
            root.left = null;
            size--;
            return leftNode;
        }

        root.right = removeMin(root.right);
        return root;
    }

    public Node remove(Node node, E e) {
        if (node == null) return null;
        if (e.compareTo(node.e) < 0) {
            node.left = remove(node.left, e);
            return node;
        } else if (e.compareTo(node.e) > 0) {
            node.right = remove(node.right, e);
            return node;
        } else {

            if (root.left == null) {
                Node rightNode = root.right;
                root.right = null;
                size--;
                return rightNode;
            }

            if (root.right == null) {
                Node leftNode = root.left;
                root.left = null;
                size--;
                return leftNode;
            }

            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;

            node.left = node.right = null;

            return successor;

        }
    }

    /**
     * 寻找二分搜索树中的最小值
     */
    public E minimum() {
        if (size == 0) {
            throw new IllegalArgumentException("当前二分搜索树没有数据");
        }
        return minimum(root).e;
    }

    private Node minimum(Node root) {
        if (root.left == null) return root;
        return minimum(root.left);
    }


    /**
     * 寻找二分搜索树中的最大值
     */
    public E maximum() {
        if (size == 0) {
            throw new IllegalArgumentException("当前二分搜索树没有数据");
        }
        return maximum(root).e;
    }

    private Node maximum(Node root) {
        if (root.right == null) return root;
        return minimum(root.right);
    }


    /**
     * 二分搜索树的前序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) return;

        System.out.println(node.e);

        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历
     */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    /**
     * 后序遍历
     */
    public void postOrder() {
        postOrder(root);
    }

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.println(node.e);
            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }
}
