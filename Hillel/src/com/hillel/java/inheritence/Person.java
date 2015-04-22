package com.hillel.java.inheritence;

/**
 * Created by ITyan on 22.04.2015.
 */
public class Person {

    private String name;

//    public Person() {
//        System.out.println("creating Person");
//    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
