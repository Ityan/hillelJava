package com.hillel.java.pattern.decorator;

/**
 * Created by ITyan on 28.05.2015.
 */
public class Cream extends BeverageDecorator {

    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int coast() {
        return beverage.coast() + 10;
    }

    @Override
    public String description() {
        return beverage.description() + ", cream";
    }
}
