package com.hillel.java.serialization;

import java.io.Serializable;

/**
 * Created by ITyan on 04.06.2015.
 */
public class Car implements Serializable {

    private static final long serialVersionUID = 3L;

    private String manufacturer;

    transient private int fuelConsumption;// transient - устанавливает null в сериализации

    private CarOwner carOwner;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car(String manufacturer, int fuelConsumption, CarOwner carOwner) {
        this.manufacturer = manufacturer;
        this.fuelConsumption = fuelConsumption;
        this.carOwner = carOwner;
        System.out.println("In constructor");
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", carOwner=" + carOwner +
                '}';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }
}
