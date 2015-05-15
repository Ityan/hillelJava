package com.hillel.java.advancedOOP.abserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ITyan on 15.05.2015.
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

        weatherData.recieveData(19, 50);
        print(displayables);

        System.out.println();

        weatherData.recieveData(21, 55);
        print(displayables);
    }

    public static void  print(List<Displayable> displayables) {
        for (Displayable d : displayables) {
            d.display();
        }
    }
}
