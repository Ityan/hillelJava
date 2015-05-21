package com.hillel.java.pattern.strategy.quack;

/**
 * Created by ITyan on 24.04.2015.
 */
public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack!";
    }
}
