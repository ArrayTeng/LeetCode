package com.example.tengfei.day10;

import java.text.SimpleDateFormat;

/**
 * @author by tengfei on 2020/6/2.
 * @description：
 */
public class ThreadLocalNormal01 {



    static class ThreadSafeFormatter{
        public  ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>(){
            @Override
            protected SimpleDateFormat initialValue() {
                return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            }
        };

    }
}
