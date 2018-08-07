package com.mtq.lookfor.module.mobile.model;

import com.blankj.utilcode.util.LogUtils;
import com.mtq.lookfor.data.retrofit.ApiClient;
import com.mtq.lookfor.data.retrofit.ApiService;
import com.mtq.lookfor.module.mobile.bean.Mobile;
import com.mtq.lookfor.module.mobile.presenter.OnMobileListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by zhaoqy on 2018/7/12.
 */

public class MobileModelImpl implements IMobileModel {

    /**
     *
     */
    @Override
    public void queryMobile(String mobile, final OnMobileListener listener) {
        Retrofit retrofit = ApiClient.retrofit();
        ApiService request = retrofit.create(ApiService.class);
        Call<Mobile> call = request.queryMobile(ApiClient.APPKEY, mobile);
        call.enqueue(new Callback<Mobile>() {

            @Override
            public void onResponse(Call<Mobile> call, Response<Mobile> response) {
                LogUtils.e("ZQY", " === onResponse ===");
                if (response != null) {
                    listener.onSuccess(response.body());
                } else {
                    listener.onFail("返回结果为空");
                }
            }

            @Override
            public void onFailure(Call<Mobile> call, Throwable throwable) {
                LogUtils.e("ZQY", " === onFailure ===");
                listener.onFail(throwable.toString());
            }
        });
    }
}
