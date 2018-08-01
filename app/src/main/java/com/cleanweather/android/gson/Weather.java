package com.cleanweather.android.gson;

import java.util.List;

/**
 * Created by MrDing on 2018/4/8.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    public List<Forecast> forecastList;
}
