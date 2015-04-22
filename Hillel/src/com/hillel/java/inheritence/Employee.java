package com.hillel.java.inheritence;

/**
 * @author ITyan  on 22.04.2015.
 */
public class Employee extends Person {

    private String department;

    public Employee() {
        super("default name");
        System.out.println("creating Employee");
    }

    public Employee(String name, String department) {
        super(name);
        this.department = department;
        System.out.println("creating Employee");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
