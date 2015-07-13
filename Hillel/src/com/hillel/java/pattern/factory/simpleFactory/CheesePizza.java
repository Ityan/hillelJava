package com.hillel.java.pattern.factory.simpleFactory;

import com.hillel.java.pattern.factory.Cheese;
import com.hillel.java.pattern.factory.Dough;
import com.hillel.java.pattern.factory.Pizza;

/**
 * Created by ITyan on 13.07.2015.
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        setCheese(new Cheese("Rockfor"));
        setDough(new Dough("Thick"));
    }
}
