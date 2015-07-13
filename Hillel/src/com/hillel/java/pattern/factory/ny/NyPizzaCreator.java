package com.hillel.java.pattern.factory.ny;

import com.hillel.java.pattern.factory.Pizza;
import com.hillel.java.pattern.factory.PizzaCreator;
import com.hillel.java.pattern.factory.PizzaType;

/**
 * Created by ITyan on 13.07.2015.
 */
public class NyPizzaCreator implements PizzaCreator {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case SEAFOOD:
                pizza = new NySeafoodPizza();
                break;
            case CHEESE:
                pizza = new NyCheesePizza();
                break;
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
        return pizza;
    }

}
