package com.kb260.com.bjt_user;

import android.app.Application;

/**
 * Created by kb260 on 2017/4/24
 */

public class MyAPP extends Application{
    private static MyAPP instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static MyAPP getInstance(){
        return instance;
    }
}
