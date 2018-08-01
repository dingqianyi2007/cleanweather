package com.cleanweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MrDing on 2018/4/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
