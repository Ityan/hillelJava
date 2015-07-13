package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public class Seafood {

    String name;

    public Seafood(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Seafood{" +
                "name='" + name + '\'' +
                '}';
    }
}
