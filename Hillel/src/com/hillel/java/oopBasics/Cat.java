package com.hillel.java.oopBasics;

import java.util.Arrays;

/**
 * Created by ITyan on 10.04.2015.
 */
public class Cat {
    private String name;

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Incorrect age value: " + age);
        }
        this.age = age;
    }

    private int age;
    private Vaccine[] vaccines = new Vaccine[10];
    private int vaccineCount = 0;
    private String ownerName;

    public Cat() {

    }

    public Cat(String name) {
        this(name, 0);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String toString() {
        String result = "com.hillel.java.oopBasics.Cat ";
        result += name;
        result += age;
        result += Arrays.toString(vaccines);
        return result;
    }

    public void acceptVaccine(String vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
    }

    public static int pawCount() {
        Cat cat = new Cat();
        cat.acceptVaccine("afg");
        return 4;
    }

    public boolean equals(Object other) {
        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
