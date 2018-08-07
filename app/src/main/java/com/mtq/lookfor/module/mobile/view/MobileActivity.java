package com.mtq.lookfor.module.mobile.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mtq.lookfor.R;
import com.mtq.lookfor.base.BaseActivity;
import com.mtq.lookfor.module.mobile.bean.Mobile;
import com.mtq.lookfor.module.mobile.presenter.IMobilePresenter;
import com.mtq.lookfor.module.mobile.presenter.MobilePresenterImpl;

import butterknife.BindView;
import butterknife.OnClick;


public class MobileActivity extends BaseActivity implements IMobileView {

    @BindView(R.id.et_mobile)
    EditText mobileEdit;

    @BindView(R.id.tv_province)
    TextView province;

    @BindView(R.id.tv_city)
    TextView city;

    @BindView(R.id.tv_company)
    TextView company;

    @BindView(R.id.tv_cardtype)
    TextView cardtype;

    @BindView(R.id.pb_progress)
    ProgressBar progressBar;

    IMobilePresenter mobilePresenter;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_mobile;
    }

    @Override
    protected String getTitleName() {
        return "手机归属地";
    }

    @Override
    protected void initData() {
        mobilePresenter = new MobilePresenterImpl(this);
    }

    @Override
    protected void loadData() {

    }

    @OnClick({R.id.btn_query})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_query: {
                String mobile = mobileEdit.getText().toString();
                if (!TextUtils.isEmpty(mobile)) {
                    mobilePresenter.queryMobile(mobile);
                } else {
                    Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
                }
                break;
            }
        }
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onSuccess(Mobile mobile) {
        if (mobile != null) {
            Mobile.MobileInfo mobileInfo = mobile.result;
            province.setText("省：" + mobileInfo.province);
            city.setText("市：" + mobileInfo.city);
            company.setText("运营商：" + mobileInfo.company);
            cardtype.setText("卡类型：" + mobileInfo.cardtype);
        } else {
            Toast.makeText(this, "获取失败", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFail(String msg) {
        province.setText("省：==");
        city.setText("市：==");
        company.setText("运营商：==");
        cardtype.setText("卡类型：==");
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
