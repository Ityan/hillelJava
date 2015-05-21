package com.hillel.java.pattern.strategy.duck;

import com.hillel.java.pattern.strategy.fly.FlyNoWay;
import com.hillel.java.pattern.strategy.quack.Silence;

/**
 * Created by ITyan on 24.04.2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Silence());
    }

    @Override
    public String display() {
        return "Rubber duck";
    }
}
