package com.example.tengfei.day08;

/**
 * @author by tengfei on 2020/4/12.
 * @description：
 */
public class CacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {

        Request request = chain.request();

        Response response = new Response();

        response.responseMessage = request.requestMessage+" : CacheInterceptor_response_message";
        return response;
    }
}
