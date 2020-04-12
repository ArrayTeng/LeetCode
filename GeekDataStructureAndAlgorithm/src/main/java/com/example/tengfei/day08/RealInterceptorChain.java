package com.example.tengfei.day08;

import java.util.List;

/**
 * @author by tengfei on 2020/4/12.
 * @description：
 */
public final class RealInterceptorChain implements Interceptor.Chain {

    private final List<Interceptor> interceptors;

    private final Request request;

    private final int index;


    public RealInterceptorChain(List<Interceptor> interceptors, Request request, int index) {
        this.interceptors = interceptors;
        this.request = request;
        this.index = index;
    }


    @Override
    public Request request() {
        return request;
    }

    @Override
    public Response proceed(Request request) {
        if (index >= interceptors.size()) throw new AssertionError();

        RealInterceptorChain next = new RealInterceptorChain(interceptors, request, index + 1);
        Interceptor interceptor = interceptors.get(index);
        Response response = interceptor.intercept(next);
        return response;
    }
}
