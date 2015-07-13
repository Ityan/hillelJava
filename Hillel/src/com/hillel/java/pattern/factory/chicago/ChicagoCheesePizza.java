package com.hillel.java.pattern.factory.chicago;

import com.hillel.java.pattern.factory.Cheese;
import com.hillel.java.pattern.factory.Dough;
import com.hillel.java.pattern.factory.Pizza;

/**
 * Created by ITyan on 13.07.2015.
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        setDough(new Dough("Thick"));
        setCheese(new Cheese("Mozarella"));
    }
}
