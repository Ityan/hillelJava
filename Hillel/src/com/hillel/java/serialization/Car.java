package com.hillel.java.serialization;

import java.io.Serializable;

/**
 * Created by ITyan on 04.06.2015.
 */
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;
    String manufacturer;

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
