package com.hillel.java.advancedOOP.abserver;

/**
 * Created by ITyan on 15.05.2015.
 */
public class Weather {

    private int temperature;
    private int humidity;

    public Weather(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }
}
