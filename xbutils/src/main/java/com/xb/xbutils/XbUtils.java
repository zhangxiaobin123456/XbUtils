package com.xb.xbutils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/**
 * Created by zxb.
 */
public class XbUtils {
    /**
     * 初始化
     * @param context
     */
    public static void init(Context context){
        XbApplication.mContext = context;
    }

    /**
     * 获取字符串资源
     * @param resId
     * @return
     */
    public static String getString(int resId) {
        return XbApplication.getContext().getResources().getString(resId);
    }

    /**
     * 获取字符串数组
     * @param resId
     * @return
     */
    public static String[] getStringArray(int resId) {
        return XbApplication.getContext().getResources().getStringArray(resId);
    }

    /**
     * 获取drawable
     * @param resId
     * @return
     */
    public static Drawable getDrawable(int resId) {
        return XbApplication.getContext().getResources().getDrawable(resId);
    }

    /**
     * 获取color的值
     * @param resId
     * @return
     */
    public static int getColor(int resId) {
        return XbApplication.getContext().getResources().getColor(resId);
    }

    /**
     * 获取颜色的状态选择器
     * @param resId
     * @return
     */
    public static ColorStateList getColorStateList(int resId) {
        return XbApplication.getContext().getResources().getColorStateList(resId);
    }

    /**
     *  获取dimen下定义的值
     * @param resId
     * @return
     */
    public static int getDimen(int resId) {
        return XbApplication.getContext().getResources().getDimensionPixelSize(resId);
    }

    /**
     * dp--px
     */
    public static int dp2px(int dp) {
        // 1、获取屏幕密度
        float density = XbApplication.getContext().getResources().getDisplayMetrics().density;
        // 2、进行乘法操作
        return (int) (dp * density + 0.5);
    }

    /**
     *  px--dp
     */
    public static int px2dp(int px) {
        // 1、获取屏幕密度
        float density = XbApplication.getContext().getResources().getDisplayMetrics().density;
        // 2、进行除法操作
        return (int) (px / density + 0.5);
    }
}
