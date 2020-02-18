package com.example.tengfei.day03;

/**
 * @author by tengfei on 2020/2/18.
 * @description：
 */
public class ArrayQueue {

    private String[] items;


    private int head;
    private int tail;

    private int index;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        head = 0;
        tail = 0;
        index = capacity;
    }

    public boolean enqueue(String item) {
        if (tail == index) {
            if (head == 0) return false;

            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }

            tail = tail - head;
            head = 0;
        }

        items[tail] = item;
        tail++;
        return true;
    }

    public String dequeue() {
        if (head == tail) return null;
        String result = items[head];
        head++;
        return result;
    }
}
