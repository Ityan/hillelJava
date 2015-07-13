package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public class PizzaStore {

    PizzaCreator pizzaCreator;

    public PizzaStore(PizzaCreator pizzaCreator) {
        this.pizzaCreator = pizzaCreator;
    }

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = pizzaCreator.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();

        return pizza;
    }

}
