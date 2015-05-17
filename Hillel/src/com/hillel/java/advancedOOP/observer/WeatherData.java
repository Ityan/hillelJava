package com.hillel.java.advancedOOP.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ITyan on 15.05.2015.
 */
public class WeatherData {

    private Weather weather;

    private List<Updatable> updatables = new ArrayList<>();

    public void addObserver(Updatable observer) {
        updatables.add(observer);
    }

    public void recieveData(int temperature, int humidity) {
        weather = new Weather(temperature, humidity);

        measurmentCganged();
    }

    private void measurmentCganged() {

        for (Updatable observer : updatables) {
            observer.update(weather);
        }
    }
}
