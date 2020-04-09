package com.example.tengfei.day06;

/**
 * @author by tengfei on 2020/2/29.
 * @description：
 */
public interface Set<E> {

    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
