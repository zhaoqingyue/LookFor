package com.mtq.lookfor.module.main;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mtq.lookfor.R;
import com.mtq.lookfor.base.BaseActivity;
import com.mtq.lookfor.module.mobile.view.MobileActivity;
import com.mtq.lookfor.utils.GridDivider;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainAdapter.OnItemClickListener{

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    com.mtq.lookfor.module.main.MainAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected String getTitleName() {
        return getResources().getString(R.string.app_name);
    }

    @Override
    protected void initData() {
        layoutManager = new GridLayoutManager(this, 3, OrientationHelper.VERTICAL, false);
        adapter = new com.mtq.lookfor.module.main.MainAdapter(this, MainHelper.getMainList());
        adapter.setOnItemClickListener(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new GridDivider(this));
    }

    @Override
    protected void loadData() {

    }

    @Override
    protected boolean isHasNaviIcon() {
        return false;
    }

    @Override
    public void onItemClick(View view, int position) {
        switch (position) {
            case 2: {
                Intent intent = new Intent(this, MobileActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
