package com.example.tengfei.day11_classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author by tengfei on 2020/6/9.
 * @description：
 */
public class Test {

    public static void main(String[] args) {

        DiskClassLoader diskClassLoader = new DiskClassLoader("/Users/tengfei/AndroidStudy/LeetCode/");

        try {
            Class clazz = diskClassLoader.loadClass("Secret");
            System.out.println(clazz.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
