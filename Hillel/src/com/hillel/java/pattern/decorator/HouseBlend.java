package com.hillel.java.pattern.decorator;

/**
 * Created by ITyan on 28.05.2015.
 */
public class HouseBlend extends Beverage {
    @Override
    public int coast() {
        return 120;
    }

    @Override
    public String description() {
        return "House blend";
    }
}
