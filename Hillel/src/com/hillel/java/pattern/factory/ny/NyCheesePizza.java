package com.hillel.java.pattern.factory.ny;

import com.hillel.java.pattern.factory.Cheese;
import com.hillel.java.pattern.factory.Dough;
import com.hillel.java.pattern.factory.Pizza;

/**
 * Created by ITyan on 13.07.2015.
 */
public class NyCheesePizza extends Pizza {

    public NyCheesePizza() {
        setDough(new Dough("thin"));
        setCheese(new Cheese("Parmesan"));
    }
}
