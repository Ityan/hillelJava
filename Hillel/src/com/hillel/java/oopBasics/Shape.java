package com.hillel.java.oopBasics;

/**
 * Created by ITyan on 22.04.2015.
 */
public abstract class Shape implements Colored {

    public abstract int getArea();

    @Override
    public String toString() {
        return "area is: " + getArea();
    }
}
