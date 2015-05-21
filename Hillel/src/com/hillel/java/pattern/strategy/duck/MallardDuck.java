package com.hillel.java.pattern.strategy.duck;

import com.hillel.java.pattern.strategy.fly.Fly;
import com.hillel.java.pattern.strategy.quack.Quack;

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
