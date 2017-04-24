package com.kb260.com.bjt_user.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kb260.com.bjt_user.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {
    private Unbinder bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置布局内容
        setContentView(getLayoutId());
        //初始化黄油刀控件绑定框架
        bind = ButterKnife.bind(this);
        //初始化控件
        initViews(savedInstanceState);
        //初始化ToolBar
        initToolBar();
    }

    public abstract int getLayoutId();

    public abstract void initViews(Bundle savedInstanceState);

    public abstract void initToolBar();


    public void loadData() {}


    public void showProgressBar() {}


    public void hideProgressBar() {}


    public void initRecyclerView() {}


    public void initRefreshLayout() {}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}
