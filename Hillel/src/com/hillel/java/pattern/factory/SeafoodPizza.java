package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public class SeafoodPizza extends Pizza {

    public SeafoodPizza(IngredientCreator ingredientCreator) {
        setDough(ingredientCreator.createDough());
        setSeafood(ingredientCreator.createSeafood());
    }
}
