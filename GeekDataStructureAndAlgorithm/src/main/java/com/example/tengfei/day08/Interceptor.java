package com.example.tengfei.day08;

/**
 * @author by tengfei on 2020/4/12.
 * @description：
 */
public interface Interceptor {

    Response intercept(Chain chain);

    interface Chain {
        Request request();

        Response proceed(Request request);

    }
}
