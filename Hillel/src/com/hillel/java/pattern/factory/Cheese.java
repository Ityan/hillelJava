package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public class Cheese {

    String name;

    public Cheese(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                '}';
    }
}
