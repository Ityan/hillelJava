package com.hillel.java.advancedOOP.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ITyan on 15.05.2015.
 */
public class StatisticDisplay implements Updatable, Displayable {

    private List<Weather> weatherHistory = new ArrayList<>();

    @Override
    public void update(Weather weather) {
        weatherHistory.add(weather);
    }

    @Override
    public void display() {
        Weather avgWeather = average(weatherHistory);

        System.out.println("Statistics: averageTemp " + avgWeather.getTemperature() +
                ", averageHumidity " + avgWeather.getHumidity());
    }

    private Weather average(List<Weather> list) {
        if (list.isEmpty()) return new Weather(0 , 0);

        int sumTemp = 0;
        int sumHum = 0;
        for (Weather i : list) {
            sumTemp += i.getTemperature();
            sumHum += i.getHumidity();
        }
        int avgTemp = (int) Math.round((sumTemp * 1.0) / list.size());
        int avgHum = (int) Math.round((sumHum * 1.0) / list.size());

        return new Weather(avgTemp, avgHum);
    }
}
