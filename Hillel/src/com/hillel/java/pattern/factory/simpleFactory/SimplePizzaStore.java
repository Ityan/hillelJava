package com.hillel.java.pattern.factory.simpleFactory;

import com.hillel.java.pattern.factory.Pizza;
import com.hillel.java.pattern.factory.PizzaType;

/**
 * @author ITyan on 13.07.2015.
 */
public class SimplePizzaStore {

    private SimplePizzaCreator pizzaCreator = new SimplePizzaCreator();

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = pizzaCreator.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();

        return pizza;
    }

}
