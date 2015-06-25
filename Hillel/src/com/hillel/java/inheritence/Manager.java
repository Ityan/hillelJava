package com.hillel.java.inheritence;

/**
 * Created by ITyan on 25.06.2015.
 */
public class Manager extends Employee {

    private String department;

    public Manager(String name, String department) {
        super(name, department);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void makeCoffee() {
        System.out.println("I'm making coffee");
    }
}
