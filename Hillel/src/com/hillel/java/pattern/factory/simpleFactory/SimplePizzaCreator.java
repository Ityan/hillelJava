package com.hillel.java.pattern.factory.simpleFactory;

import com.hillel.java.pattern.factory.Pizza;
import com.hillel.java.pattern.factory.PizzaType;

/**
 * @author ITyan on 13.07.2015.
 */
public class SimplePizzaCreator {  //FACTORY EXAMPLE

    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case SEAFOOD:
                pizza = new SeafoodPizza();
                break;
            case CHEESE:
                pizza = new CheesePizza();
                break;
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
        return pizza;
    }

}
