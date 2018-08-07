package com.mtq.lookfor.module.mobile.bean;

import com.mtq.lookfor.base.BaseBean;

/**
 * Created by zhaoqy on 2018/7/12.
 */

public class Mobile extends BaseBean {

    public MobileInfo result;

    public class MobileInfo {
        public String province; // 省
        public String city;     // 市
        public String company;  // 运营商
        public String cardtype; // 卡类型
    }
}
