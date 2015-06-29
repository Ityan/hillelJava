package com.hillel.java.generics;

import com.hillel.java.inheritence.Employee;
import com.hillel.java.inheritence.Manager;
import com.hillel.java.inheritence.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author ITyan on 25.06.2015.
 */
public class GenericsMain {
    public static void main(String[] args) {

        Person person = new Person("Ad");
        Employee employee = new Employee("Ad", "IT");
        Manager manager = new Manager("Tom", "Management");


        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(employee);
        persons.add(manager);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(manager);

        List<Manager> managers = new ArrayList<>();
        managers.add(manager);

        //printDepartment(persons);
        printDepartment(employees);
        printDepartment(managers);

        addEmployee(employees);
        addEmployee(persons);

        managers = Collections.<Manager>emptyList();

        employees = Collections.singletonList(manager);
    }

    public static <T> List<T> copyCollection(List<T> source) {
        return new ArrayList<>(source);
    }

    public static void addEmployee(List<? super Employee> employees) {
        employees.add(new Employee("Ivan", "Staff"));
    }

    public static void printDepartment(Employee employee) {
        System.out.println(employee.getDepartment());
    }

    public static void printDepartment(List<? extends Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getDepartment());
        }
    }

    private static void pairUsage() {
        Pair<Integer, String> pair = new Pair<>(1, "one");

        Integer first = pair.getFirst();
        String second = pair.getSecond();
    }

    private static void inheritanceAndGenerics() {
        List<Integer> listIntegers = new ArrayList<>();

        listIntegers.add(10);
        listIntegers.add(2);
        //listIntegers.add("3");

        for (Object o : listIntegers) {

            System.out.println(o);
        }

        Person person = new Person("Ad");
        Employee employee = new Employee("Ad", "IT");
        Manager manager = new Manager("Tom", "Management");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(employee);
        persons.add(manager);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(manager);

        List<Manager> managers = new ArrayList<>();
        managers.add(manager);

        //employee = manager;

        employees = (List) managers;

        employees.add(manager);
        employees.add(employee);

        Manager manager1 = managers.get(2);

        Collection<Employee> employeeCollection = employees;
    }
}
