package com.ch;

import com.ch.beans.Weather;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * 观察者类
 * @author CH
 * @date 2021-08-11 16:02
 */
public class MyWeb implements PropertyChangeListener {

    private Weather weather;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.weather = (Weather) evt.getNewValue();
        display();
    }
    public void display(){
        System.out.println("*** temperature is:"+weather.getTemperature());
        System.out.println("*** humidity is:"+ weather.getHumidity());
        System.out.println("*** wind is:"+ weather.getWind());
    }
}
