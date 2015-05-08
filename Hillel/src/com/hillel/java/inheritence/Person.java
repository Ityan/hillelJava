package com.hillel.java.inheritence;

import com.hillel.java.composition.Namable;

/**
 * Created by ITyan on 22.04.2015.
 */
public class Person implements Namable, Comparable<Person> {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
