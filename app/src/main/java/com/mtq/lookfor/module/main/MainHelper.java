package com.mtq.lookfor.module.main;

import com.mtq.lookfor.R;

import java.util.ArrayList;

/**
 * Created by zhaoqy on 2018/7/11.
 */

public class MainHelper {

    public static ArrayList<Main> getMainList() {
        ArrayList<Main> list = new ArrayList<Main>();

        Main main0 = new Main();
        main0.name = "IP";
        main0.resid = R.mipmap.ip;
        list.add(main0);

        Main main10 = new Main();
        main10.name = "天气预报";
        main10.resid = R.mipmap.weather;
        list.add(main10);

        Main main2 = new Main();
        main2.name = "手机归属地";
        main2.resid = R.mipmap.mobile;
        list.add(main2);

        Main main3 = new Main();
        main3.name = "身份证";
        main3.resid = R.mipmap.idcard;
        list.add(main3);

        Main main4 = new Main();
        main4.name = "邮编";
        main4.resid = R.mipmap.zipcode;
        list.add(main4);

        Main main6 = new Main();
        main6.name = "火车时刻";
        main6.resid = R.mipmap.train;
        list.add(main6);

        Main main12 = new Main();
        main12.name = "公交地铁";
        main12.resid = R.mipmap.transit;
        list.add(main12);

        Main main1 = new Main();
        main1.name = "地区";
        main1.resid = R.mipmap.area;
        list.add(main1);

        Main main5 = new Main();
        main5.name = "区号";
        main5.resid = R.mipmap.areacode;
        list.add(main5);

        Main main7 = new Main();
        main7.name = "汇率";
        main7.resid = R.mipmap.exchange;
        list.add(main7);

        Main main11 = new Main();
        main11.name = "空气质量";
        main11.resid = R.mipmap.aqi;
        list.add(main11);

        Main main8 = new Main();
        main8.name = "星座运势";
        main8.resid = R.mipmap.astro;
        list.add(main8);

        Main main9 = new Main();
        main9.name = "黄历";
        main9.resid = R.mipmap.huangli;
        list.add(main9);

        return list;
    }
}
