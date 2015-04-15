package com.hillel.java.oopBasics;

/**
 * Created by ITyan on 10.04.2015.
 */
public class OOP {

    public static void main(String[] args) {
        oopIntro();
        negativeAge();

        Vet vet = new Vet();
        Cat cat1 = new Cat("Tom", 2);
        Cat cat2 = cat1;
        System.out.println(cat1 == cat2);

        cat2 = new Cat("Tom", 2);

        Cat cat3 = null;
        vet.registerCat(cat3);


        System.out.println(cat1.equals(cat2));


        oopIntro();
    }

    public static void negativeAge() {
        Cat cat = new Cat();
        cat.setAge(-1);
        System.out.println("This message never be printed");
    }

    public static void oopIntro() {
        Cat cat1 = new Cat("Tom", 2);

        Cat cat2 = new Cat("Jon", 1);

        Vet vet = new Vet();

        vet.registerCat(cat1);
        vet.registerCat(cat2);
        vet.print();

        vet.makeVaccine();
        vet.print();

        System.out.println();
    }

}
