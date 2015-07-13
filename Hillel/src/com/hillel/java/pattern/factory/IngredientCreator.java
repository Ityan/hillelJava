package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public interface IngredientCreator {

    Dough createDough();
    Seafood createSeafood();
    Cheese createCheese();

}
