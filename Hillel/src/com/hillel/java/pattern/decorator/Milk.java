package com.hillel.java.pattern.decorator;

/**
 * Created by ITyan on 28.05.2015.
 */
public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int coast() {
        return beverage.coast() + 15;
    }

    @Override
    public String description() {
        return beverage.description() + ", milk";
    }
}
