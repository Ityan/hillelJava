package com.hillel.java.pattern.factory.chicago;

import com.hillel.java.pattern.factory.Dough;
import com.hillel.java.pattern.factory.Pizza;
import com.hillel.java.pattern.factory.Seafood;

/**
 * Created by ITyan on 13.07.2015.
 */
public class ChicagoSeafoodPizza extends Pizza {

    public ChicagoSeafoodPizza() {
        setDough(new Dough("Thick"));
        setSeafood(new Seafood("Fish"));
    }
}
