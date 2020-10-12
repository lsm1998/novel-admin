package com.ruoyi.common.utils;

public class TimeUtils
{
    public static int getNow()
    {
        return (int) (System.currentTimeMillis() / 1000);
    }
}
