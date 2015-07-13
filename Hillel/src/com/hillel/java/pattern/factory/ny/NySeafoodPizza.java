package com.hillel.java.pattern.factory.ny;

import com.hillel.java.pattern.factory.Dough;
import com.hillel.java.pattern.factory.Pizza;
import com.hillel.java.pattern.factory.Seafood;

/**
 * Created by ITyan on 13.07.2015.
 */
public class NySeafoodPizza extends Pizza {

    public NySeafoodPizza() {
        setDough(new Dough("Thin"));
        setSeafood(new Seafood("Ousters"));
    }
}
