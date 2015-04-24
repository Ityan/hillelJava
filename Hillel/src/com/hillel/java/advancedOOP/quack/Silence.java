package com.hillel.java.advancedOOP.quack;

/**
 * Created by ITyan on 24.04.2015.
 */
public class Silence implements QuackBehavior {
    @Override
    public String quack() {
        return "<silence>";
    }
}
