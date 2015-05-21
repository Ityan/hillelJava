package com.hillel.java.pattern.strategy.duck;

import com.hillel.java.pattern.strategy.fly.Fly;
import com.hillel.java.pattern.strategy.quack.Quack;

/**
 * Created by ITyan on 24.04.2015.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new Fly(), new Quack());
    }

    @Override
    public String display() {
        return "Redhead duck";
    }
}
