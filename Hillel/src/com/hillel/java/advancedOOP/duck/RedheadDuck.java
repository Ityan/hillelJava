package com.hillel.java.advancedOOP.duck;

import com.hillel.java.advancedOOP.fly.Fly;
import com.hillel.java.advancedOOP.quack.Quack;

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
