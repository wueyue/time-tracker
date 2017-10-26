package com.afdroid.timetracker.Utils;

import android.graphics.drawable.Drawable;

/**
 * Created by afrin on 25/10/17.
 */

public class AppInfo {
    private String appName;
    private Drawable appIcon;
    private boolean isSelectedForStats ;

    public AppInfo(String name, Drawable icon, boolean isSelected) {
        this.appName = name;
        this.appIcon = icon;
        this.isSelectedForStats = isSelected;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public boolean isSelectedForStats() {
        return isSelectedForStats;
    }

    public void setSelectedForStats(boolean selectedForStats) {
        isSelectedForStats = selectedForStats;
    }
}
