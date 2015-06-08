package com.hillel.java.serialization;

import java.io.Serializable;

/**
 * Created by ITyan on 08.06.2015.
 */
public class CarOwner implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public CarOwner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarOwner{" +
                "name='" + name + '\'' +
                '}';
    }
}
