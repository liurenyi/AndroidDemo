package com.example.liurenyi.androiddemo.db;

import org.litepal.crud.DataSupport;

/**
 * Created by liurenyi on 2017/3/27.
 */
public class Weather extends DataSupport {
    private int id;
    private String cityName;
    private String cityCode;
    private int temperature;
    private String weatherStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus;
    }
}
