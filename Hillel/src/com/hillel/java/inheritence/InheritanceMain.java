package com.hillel.java.inheritence;

import com.hillel.java.oopBasics.Circle;
import com.hillel.java.oopBasics.Colored;
import com.hillel.java.oopBasics.Rectangle;
import com.hillel.java.oopBasics.Shape;

import java.util.ArrayList;

/**
 * @author ITyan  on 22.04.2015.
 */
public class InheritanceMain {
    public static void main(String[] args) {

        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle(10, 5);

        ArrayList<Colored> list = new ArrayList<Colored>();
        list.add(circle);
        list.add(rectangle);

    }

    public static void polymorphism() {
        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle(10, 5);

        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(circle);
        list.add(rectangle);

        print(list);
    }

    private static void print(ArrayList<Shape> list) {
        for (Shape shape: list) {
            System.out.println(shape);
        }
    }

    private static void printArea(ArrayList<Shape> list) {
        for (Shape shape: list) {
            System.out.println("area is: " + shape.getArea());
        }
    }

    public static void overloadMethod(Employee employee, Person petr) {
        register(employee);
        register(petr);
    }

    public static void array() {
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Employee("Ivan", "IT"));
        list.add(new Person("Andrey"));

        Employee employee = (Employee) list.get(0);
    }

    public static void inconvinienWey() {
        Employee employee = new Employee("Ivan", "a");
        Person employeeAsPerson = employee;
        Object employeeAsObject = employeeAsPerson;

        register(employee);
        register(employeeAsPerson);

        ArrayList array = new ArrayList();
        array.add(employee);
        array.add(employeeAsPerson);
        array.add(employeeAsObject);

        employee = (Employee) array.get(0);
        employeeAsPerson = (Person) array.get(1);
        employeeAsObject = array.get(2);

        if (employeeAsPerson instanceof Employee) {
            employee = (Employee) employeeAsPerson;
        }
        if (employee instanceof Person) {
            System.out.println("realy?");
        }
    }

    public static void register(Employee employee) {
        System.out.println("employee registered: " + employee.getName());
    }

    public static void register(Person person) {
        System.out.println("person registered: " + person.getName());
    }

    public static void constructors() {
        //Person person = new Person("Ivan");

        Employee employee = new Employee("Petr", "IT");

    }
}
