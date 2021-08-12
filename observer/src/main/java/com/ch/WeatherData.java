package com.ch;

import com.ch.beans.Weather;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 核心
 * 1. 包含公共信息
 * 2. 包含观察者集合
 * @author CH
 * @date 2021-08-11 15:34
 */
public class WeatherData {

    private Weather weather;

    private PropertyChangeSupport support;

    public WeatherData() {
        this.support = new PropertyChangeSupport(this);
    }

    public WeatherData(float temperature, float humidity, String wind) {
        weather = new Weather(temperature, humidity, wind);
        this.support = new PropertyChangeSupport(this);
    }

    /**
     * 公共信息更新
     * @param temperature
     * @param humidity
     * @param wind
     */
    public void setData(float temperature, float humidity, String wind){
        Weather newWeather = new Weather(temperature, humidity, wind);
        //观察者中的信息更新
        support.firePropertyChange("weather", this.weather, newWeather);
        this.weather = newWeather;
    }

    /**
     * 添加观察者
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    /**
     * 删除观察者
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
