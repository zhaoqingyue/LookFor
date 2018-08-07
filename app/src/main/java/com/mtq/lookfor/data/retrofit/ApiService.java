package com.mtq.lookfor.data.retrofit;

import com.mtq.lookfor.module.mobile.bean.Mobile;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zhaoqy on 2018/7/12.
 */

public interface ApiService {

    // http://api.jisuapi.com/shouji/query?appkey=yourappkey&shouji=xxx
    @GET("shouji/query")
    Call<Mobile> queryMobile(@Query("appkey") String appkey, @Query("shouji") String shouji);
}
