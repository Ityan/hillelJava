package com.hillel.java.pattern.decorator;

/**
 * Created by ITyan on 28.05.2015.
 */
public class Arabica extends Beverage {
    @Override
    public int coast() {
        return 100;
    }

    @Override
    public String description() {
        return "Arabica";
    }
}
