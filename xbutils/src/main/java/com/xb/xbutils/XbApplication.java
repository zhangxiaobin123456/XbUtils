package com.xb.xbutils;

import android.app.Application;
import android.content.Context;

/**
 * Created by zxb.
 */
public class XbApplication extends Application {


    public static Context mContext;
    public XbApplication() {
        mContext = this;
    }
    public static void init(Context context) {
        mContext = context;
    }

    public static Context getContext() {
        if (mContext == null) {
            throw new ContextException(ContextException.ContextIsNull);
        }
        return mContext;
    }
}
