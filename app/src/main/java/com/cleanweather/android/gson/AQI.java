package com.cleanweather.android.gson;

/**
 * Created by MrDing on 2018/4/8.
 */

public class AQI {
    public  AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
