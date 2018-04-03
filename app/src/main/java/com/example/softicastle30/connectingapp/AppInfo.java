package com.example.softicastle30.connectingapp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;

import java.text.Collator;
import java.util.Comparator;

/**
 * Created by SOFTiCastle30 on 2018-03-21.
 */

public class AppInfo {
    public static interface AppFilter{
        public void init();
        public boolean filterApp(ApplicationInfo info);
    }

    public Drawable mIcon = null;
    public String mAppName = null;
    public String mAppPackage = null;

    public static final AppFilter THIRD_PARTY_FILTER = new AppFilter() {
        @Override
        public void init() {

        }

        @Override
        public boolean filterApp(ApplicationInfo info) {
            if ((info.flags & ApplicationInfo.FLAG_UPDATED_SYSTEM_APP) !=0) {
                return true;
            } else if ((info.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                return true;
            }
            return false;
        }
    };

    public static final Comparator<AppInfo> ALPHA_COMPARATOR = new Comparator<AppInfo>() {
        private final Collator sCollator = Collator.getInstance();
        @Override
        public int compare(AppInfo object1, AppInfo object2) {
            return sCollator.compare(object1.mAppName, object2.mAppName);
        }
    };

}
