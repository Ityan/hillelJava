package com.hillel.java.pattern.strategy.duck;

import com.hillel.java.pattern.strategy.fly.FlyNoWay;
import com.hillel.java.pattern.strategy.quack.Quack;

/**
 * Created by ITyan on 24.04.2015.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public String display() {
        return "Decoy";
    }
}
