package com.hillel.java.pattern.strategy.fly;

/**
 * Created by ITyan on 24.04.2015.
 */
public class Fly implements FlyBehavior {
    @Override
    public String fly() {
        return "I flying";
    }
}
