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

    public void addGrade(String name, Integer grade) throws UnknownStudentException, GradeAlreadyExistException {
        if (!namesToGrade.containsKey(name)) {
            throw new UnknownStudentException("Unknown student: " + name);
        }

        Integer existedGrade = namesToGrade.get(name);
        if (existedGrade != null){
            throw new GradeAlreadyExistException("name: " + name + ", existed grade: " + grade + " , new grade: " + existedGrade);
        }

        if (name == null) {
            throw new NullPointerException("name is null");
        }
        namesToGrade.put(name, grade);
    }
}
