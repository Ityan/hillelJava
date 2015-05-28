package com.hillel.java.pattern.decorator;

/**
 * Created by ITyan on 28.05.2015.
 */
public class Robusta extends Beverage {
    @Override
    public int coast() {
        return 80;
    }

    @Override
    public String description() {
        return "Robusta";
    }
}
