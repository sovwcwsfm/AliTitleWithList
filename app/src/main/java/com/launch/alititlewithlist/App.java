package com.launch.alititlewithlist;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

public class App extends Application{
    private static App mCurrent;

    @Override
    public void onCreate() {
        super.onCreate();

        mCurrent = this;
    }

    public static App getCurrent(){
        return mCurrent;
    }

    public static Context getContext() {
        return mCurrent.getApplicationContext();
    }
}
