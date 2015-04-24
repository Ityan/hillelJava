package com.hillel.java.advancedOOP.duck;

import com.hillel.java.advancedOOP.fly.FlyNoWay;
import com.hillel.java.advancedOOP.quack.Quack;

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
