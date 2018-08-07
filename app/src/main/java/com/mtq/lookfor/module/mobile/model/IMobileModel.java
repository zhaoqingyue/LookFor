package com.mtq.lookfor.module.mobile.model;

import com.mtq.lookfor.module.mobile.presenter.OnMobileListener;

/**
 * Created by zhaoqy on 2018/7/12.
 */

public interface IMobileModel {

    void queryMobile(String mobile, OnMobileListener listener);
}
