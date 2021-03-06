package com.kinstalk.m4.publichttplib.okhttp.interceptor;

import com.kinstalk.m4.publichttplib.okhttp.HttpConfiguration;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by pop on 17/4/17.
 */

public class LoggingInterceptor extends BaseInterceptor {

    public LoggingInterceptor(HttpConfiguration configuration) {
        super(configuration);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

//        long t1 = System.nanoTime();
//        DebugUtil.LogD(HttpManager.TAG, String.format(Locale.CHINA, "Sending request %s on %s%n%s", request.url(), chain.connection(), request.headers()));

        Response response = chain.proceed(request);

//        long t2 = System.nanoTime();
//        DebugUtil.LogD(HttpManager.TAG, String.format(Locale.CHINA, "Received response for %s in %.1fms%n%s", response.request().url(), (t2 - t1) / 1e6d, response.headers()));
        return response;
    }
}
