package com.hillel.java.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ITyan on 15.05.2015.
 */
public class WeatherMain {

    public static void main(String[] args) {
        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        List<Displayable> displayables = new ArrayList<>();
        displayables.add(currentWeatherDisplay);
        displayables.add(statisticDisplay);
        displayables.add(forecastDisplay);

        WeatherData weatherData = new WeatherData();

        weatherData.addObserver(currentWeatherDisplay);
        weatherData.addObserver(statisticDisplay);
        weatherData.addObserver(forecastDisplay);

        weatherData.receiveData(19, 50);
        print(displayables);

        System.out.println();

        weatherData.receiveData(21, 55);
        print(displayables);
    }

    public static void  print(List<Displayable> displayables) {
        for (Displayable d : displayables) {
            d.display();
        }
    }
}
