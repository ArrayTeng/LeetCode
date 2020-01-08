package com.leetcode.solvingproblems;

/**
 * @author tengfei
 */
public class Test {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0,0);
        myLinkedList.add(1,1);
        myLinkedList.add(2,2);
        myLinkedList.add(3,3);
        myLinkedList.add(4,4);
        myLinkedList.add(5,5);
        myLinkedList.add(6,6);


        myLinkedList.deleteAtIndex(1);
        myLinkedList.deleteAtIndex(1);
        String result = myLinkedList.toString();

        System.out.println(result);

//        System.out.println(myLinkedList.get(4));



    }
}
