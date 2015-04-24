package com.hillel.java.advancedOOP.fly;

/**
 * Created by ITyan on 24.04.2015.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public String fly() {
        return "I can't fly";
    }
}
