package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public class Dough {

    String type;

    public Dough(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dough{" +
                "type='" + type + '\'' +
                '}';
    }
}
