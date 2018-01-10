package com.xb.xbutils;

/**
 * Created by zxb.
 */
public class ContextException extends RuntimeException {
    public static String ContextIsNull = "Application context is null";
    public ContextException(String errorMessage) {
        super(errorMessage);
    }
}
