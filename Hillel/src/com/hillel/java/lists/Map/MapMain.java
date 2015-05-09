package com.hillel.java.lists.Map;

import com.hillel.java.inheritence.Person;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by ITyan on 08.05.2015.
 */
public class MapMain {
    public static void main(String[] args) {
        Person petro = new Person("Petro");
        Person taras = new Person("Taras");
        Person ivan = new Person("Ivan");

        Map<Person, String> studentToReason = new TreeMap<>();

        studentToReason.put(petro, "To become a programmer");
        studentToReason.put(taras, "Become a programmer");
        studentToReason.put(ivan, "have a lot free time");

        System.out.println("petro's reason is: " + studentToReason.get(petro));
        System.out.println("ivan's reason is: " + studentToReason.get(ivan));
    }
}
