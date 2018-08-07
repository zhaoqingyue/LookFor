package com.mtq.lookfor.data.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhaoqy on 2018/7/12.
 */

public class ApiClient {

    public static final String BASE_URL = "http://api.jisuapi.com/";
    public static final String APPKEY = "b465cc792527ffd6";

    public static Retrofit retrofit() {
        // 声明日志类
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        // 设定日志级别
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        // 自定义OkHttpClient
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        // 添加拦截器
        okHttpClient.addInterceptor(httpLoggingInterceptor);

        // 创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)                                  // 设置网络请求Url
                .addConverterFactory(GsonConverterFactory.create()) // 设置使用Gson解析
                .client(okHttpClient.build())
                .build();

        return retrofit;
    }


}
