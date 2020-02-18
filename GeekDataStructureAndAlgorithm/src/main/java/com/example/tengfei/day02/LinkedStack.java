package com.example.tengfei.day02;

import com.example.tengfei.day01.SinglyLinkedList;

/**
 * @author tengfei
 */
public class LinkedStack {

    private SinglyLinkedList<String> singlyLinkedList;

    public LinkedStack() {
        singlyLinkedList = new SinglyLinkedList<>();
    }

    public boolean push(String item) {
        try {
            singlyLinkedList.addLast(item);
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public String pop() {
        SinglyLinkedList.Node<String> node;
        try {
            //noinspection unchecked
            node = singlyLinkedList.deleteLast();
        } catch (Exception e) {
            return null;
        }
        return node.data;
    }


    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");

        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop();
        String item = linkedStack.pop();
        System.out.println(item);

    }
}
