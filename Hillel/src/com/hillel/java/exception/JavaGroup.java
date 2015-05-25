package com.hillel.java.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ITyan on 25.05.2015.
 */
public class JavaGroup {

    private Map<String, Integer> namesToGrade = new HashMap<>();

    public JavaGroup(List<String> names) {
        for (String name : names) {
            namesToGrade.put(name, null);
        }
    }

    public void addGrade(String name, Integer grade) throws UnknownStudentException{
        if (!namesToGrade.containsKey(name)) {
            throw new UnknownStudentException("Unknown student: " + name);
        }
        namesToGrade.put(name, grade);
    }
}
