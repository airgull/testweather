package com.airgull.testweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by airgull2017 on 2017/6/10.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
