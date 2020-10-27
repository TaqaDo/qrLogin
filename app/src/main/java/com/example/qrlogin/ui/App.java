package com.example.qrlogin.ui;

import android.app.Application;

import com.example.qrlogin.data.local.PreferenceUtils;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.init(this);
    }
}
