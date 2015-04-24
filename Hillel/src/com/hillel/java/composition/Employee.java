package com.hillel.java.composition;

/**
 * Created by ITyan on 24.04.2015.
 */
public class Employee {
    String department;
    Namable person;

    public String getName() {
        return person.getName();
    }
}
