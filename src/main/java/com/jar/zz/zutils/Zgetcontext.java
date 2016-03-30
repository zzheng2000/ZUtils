package com.jar.zz.zutils;

import android.app.Application;
import android.content.Context;

/**
 * Created by MSI on 2016/3/30.
 */
public class Zgetcontext extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}



