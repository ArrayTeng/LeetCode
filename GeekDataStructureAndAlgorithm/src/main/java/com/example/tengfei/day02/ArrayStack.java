package com.example.tengfei.day02;

/**
 * @author tengfei
 */
public class ArrayStack {

    private String[] items;
    private int count;
    private int n;

    public ArrayStack(int n) {
        items = new String[n];
        count = 0;
        this.n = n;
    }

    public boolean push(String item) {
        if (count == n) return false;

        items[count] = item;

        count++;
        return true;
    }

    public String pop() {
        if (count == 0) return null;

        String pop = items[count - 1];

        count--;
        return pop;
    }


    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push("1");
        arrayStack.push("3");
        arrayStack.pop();
        arrayStack.pop();
        String pop = arrayStack.pop();
        System.out.println(pop);
    }


}
