package com.mtq.lookfor.module.mobile.presenter;

import com.mtq.lookfor.module.mobile.bean.Mobile;
import com.mtq.lookfor.module.mobile.model.IMobileModel;
import com.mtq.lookfor.module.mobile.model.MobileModelImpl;
import com.mtq.lookfor.module.mobile.view.IMobileView;

/**
 * Created by zhaoqy on 2018/7/12.
 */

public class MobilePresenterImpl implements IMobilePresenter, OnMobileListener {

    IMobileView mobileView;
    IMobileModel mobileModel;

    public MobilePresenterImpl(IMobileView mobileView) {
        this.mobileView = mobileView;
        mobileModel = new MobileModelImpl();
    }

    @Override
    public void queryMobile(String mobile) {
        if (mobileView != null)
            mobileView.showProgress();

        mobileModel.queryMobile(mobile, this);
    }

    @Override
    public void onDestroy() {
        mobileView = null;
    }

    @Override
    public void onSuccess(Mobile mobile) {
        if (mobileView != null) {
            mobileView.hideProgress();
            mobileView.onSuccess(mobile);
        }
    }

    @Override
    public void onFail(String msg) {
        if (mobileView != null) {
            mobileView.hideProgress();
            mobileView.onFail(msg);
        }
    }
}
