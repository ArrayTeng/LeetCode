package com.leetcode.solvingproblems;

/**
 * @author tengfei
 *         LeetCode 707
 *         <p>
 *         如何定义虚拟头结点？
 */
public class MyLinkedList {

    private int size;

    /**
     * 定义一个虚拟头结点用来简化链表的操作
     */
    private Node dummyHeader;

    public MyLinkedList() {
        size = 0;
        dummyHeader = new Node(-1, null);
    }

    /**
     * 获取链表的长度
     */
    public int size() {
        return size;
    }

    /**
     * 获取链表中第 index 个节点的值。如果索引无效，则返回-1
     */
    public int get(int index) {
        if (index < 0 || index == size) {
            return -1;
        }
        Node prev = dummyHeader;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = prev.next;
        return node.val;
    }

    /**
     * 在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点
     */
    public void addAtHead(int val) {
        add(0, val);
    }

    /**
     * 将值为 val 的节点追加到链表的最后一个元素
     */
    public void addAtTail(int val) {
        add(size, val);
    }

    /**
     * 在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，
     * 则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点
     */
    public void addAtIndex(int index, int val) {
        if (index == size) {
            add(size, val);
        } else if (index < 0) {
            add(0, val);
        } else {
            add(index, val);
        }
    }

    /**
     * 如果索引 index 有效，则删除链表中的第 index 个节点。
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index == size) {
            return;
            //throw new IllegalArgumentException(" index 的值必须大于等于 0 并且小于 size ");
        }
        Node prev = dummyHeader;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = prev.next;
        prev.next = node.next;
        node.next = null;
        size--;
    }

    /**
     * 在往链表中添加元素的时候必须清楚的知道你所添加元素的上一个结点，尤其是当前的需求我所定义的链表是一个单链表
     *
     * @param index 所添加元素的位置
     * @param val   往链表中添加的元素
     */
    public void add(int index, int val) {
        if (index < 0 || index > size) {
            return;
            //throw new IllegalArgumentException(" index 的值必须大于等于 0 并且小于等于 size ");
        }
        Node prev = dummyHeader;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    /**
     * @return 打印链表的所有元素
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node prev = dummyHeader;
        for (int i = 0; i < size; i++) {
            prev = prev.next;
            builder.append(prev.val);
            if (i != size - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    private static class Node {
        //当前结点的值
        public int val;
        //指向下一个结点的引用
        public Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node() {
            this(-1, null);
        }

        public Node(int val) {
            this(val, null);
        }
    }
}
