package com.hillel.java.pattern.factory.chicago;

import com.hillel.java.pattern.factory.Pizza;
import com.hillel.java.pattern.factory.PizzaCreator;
import com.hillel.java.pattern.factory.PizzaType;
import com.hillel.java.pattern.factory.chicago.ChicagoCheesePizza;

/**
 * Created by ITyan on 13.07.2015.
 */
public class ChicagoPizzaCreator implements PizzaCreator {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case SEAFOOD:
                pizza = new ChicagoCheesePizza();
                break;
            case CHEESE:
                pizza = new ChicagoCheesePizza();
                break;
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
        return pizza;
    }

}
