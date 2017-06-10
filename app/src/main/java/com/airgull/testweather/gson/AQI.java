package com.airgull.testweather.gson;

/**
 * Created by airgull2017 on 2017/6/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
