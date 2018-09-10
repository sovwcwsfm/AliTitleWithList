package com.launch.alititlewithlist;

public class AppUtil {

    /*当前view的缩放比例*/
    public static float scale=0;
    /*dip 转为  px*/
    public static int dip2px(float dpValue) {
        if (0 == scale) {
            scale = App.getCurrent().getResources().getDisplayMetrics().density;
        }
        return (int) (dpValue * scale + 0.5f);
    }

    /*px 转为 dip*/
    public static int px2dip(float pxValue) {
        if (0 == scale) {
            scale = App.getCurrent().getResources().getDisplayMetrics().density;
        }

        return (int) (pxValue / scale + 0.5f);
    }
}
