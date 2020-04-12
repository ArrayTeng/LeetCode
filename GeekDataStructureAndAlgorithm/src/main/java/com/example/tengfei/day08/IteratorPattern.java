package com.example.tengfei.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by tengfei on 2020/4/12.
 * @description：
 */
public class IteratorPattern {

    public static void main(String[] args) {

        Request request = new Request();

        List<Interceptor> interceptors = new ArrayList<>();

        interceptors.add(new RetryAndFollowUpInterceptor());
        interceptors.add(new BridgeInterceptor());
        interceptors.add(new CacheInterceptor());

        Interceptor.Chain chain = new RealInterceptorChain(interceptors,request,0);

        Response response = chain.proceed(request);

        System.out.println(response.responseMessage);

    }
}
