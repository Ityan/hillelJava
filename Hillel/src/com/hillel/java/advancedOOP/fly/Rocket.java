package com.hillel.java.advancedOOP.fly;

/**
 * Created by ITyan on 24.04.2015.
 */
public class Rocket implements FlyBehavior {
    @Override
    public String fly() {
        return "YAHOOOO! I'm flying on the rocket";
    }
}
