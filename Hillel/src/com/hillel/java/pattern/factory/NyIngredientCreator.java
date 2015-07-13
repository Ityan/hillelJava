package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public class NyIngredientCreator implements IngredientCreator {
    @Override
    public Dough createDough() {
        return new Dough("Tin");
    }

    @Override
    public Seafood createSeafood() {
        return new Seafood("Oustrith");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("Parmezano");
    }
}
