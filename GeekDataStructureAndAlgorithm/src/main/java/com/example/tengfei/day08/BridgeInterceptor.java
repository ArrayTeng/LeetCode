package com.example.tengfei.day08;

/**
 * @author by tengfei on 2020/4/12.
 * @description：
 */
public class BridgeInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        Request request = chain.request();
        request.requestMessage = request.requestMessage+"   :   BridgeInterceptor_Message";
        return chain.proceed(request);
    }
}
