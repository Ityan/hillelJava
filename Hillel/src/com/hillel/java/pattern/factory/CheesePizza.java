package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public class CheesePizza extends Pizza {

    public CheesePizza(IngredientCreator ingredientCreator) {
        setDough(ingredientCreator.createDough());
        setCheese(ingredientCreator.createCheese());
    }

}
