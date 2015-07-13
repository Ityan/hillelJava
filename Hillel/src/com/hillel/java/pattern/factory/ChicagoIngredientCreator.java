package com.hillel.java.pattern.factory;

import com.hillel.java.pattern.factory.Cheese;
import com.hillel.java.pattern.factory.Dough;
import com.hillel.java.pattern.factory.IngredientCreator;
import com.hillel.java.pattern.factory.Seafood;

/**
 * Created by ITyan on 13.07.2015.
 */
public class ChicagoIngredientCreator implements IngredientCreator {
    @Override
    public Dough createDough() {
        return new Dough("Thick");
    }

    @Override
    public Seafood createSeafood() {
        return new Seafood("Fish");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("Mozarela");
    }
}
