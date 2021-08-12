package com.ch.beans;

/**
 * @author CH
 * @date 2021-08-11 16:07
 */
public class Weather {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 风向
     */
    private String wind;

    public Weather() {
    }

    public Weather(float temperature, float humidity, String wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }
}
