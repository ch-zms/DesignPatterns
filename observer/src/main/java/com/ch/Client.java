package com.ch;

import java.beans.PropertyChangeSupport;

/**
 * @author CH
 * @date 2021-08-11 16:11
 */
public class Client {
    public static void main(String[] args) {
        WeatherData observable = new WeatherData();
        MyWeb observer = new MyWeb();

        observable.addPropertyChangeListener(observer);

        observable.setData(11, 200, "东南");
        observable.setData(21, 100, "东南");
    }
}
