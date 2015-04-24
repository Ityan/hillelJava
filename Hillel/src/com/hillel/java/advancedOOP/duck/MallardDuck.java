package com.hillel.java.advancedOOP.duck;

import com.hillel.java.advancedOOP.fly.Fly;
import com.hillel.java.advancedOOP.fly.FlyBehavior;
import com.hillel.java.advancedOOP.quack.Quack;
import com.hillel.java.advancedOOP.quack.QuackBehavior;

/**
 * @author ITyan  on 24.04.2015.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new Fly(), new Quack());
    }

    @Override
    public String display() {
        return "Mallard duck";
    }
}
