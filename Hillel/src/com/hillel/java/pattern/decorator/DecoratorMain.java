package com.hillel.java.pattern.decorator;

/**
 * Created by ITyan on 28.05.2015.
 */
public class DecoratorMain {

    public static void main(String[] args) {

        Beverage coffee = new Arabica();
        System.out.println(coffee.description());

        coffee = new Milk(coffee);
        System.out.println(coffee.description());

        coffee = new Cream(coffee);
        System.out.println(coffee.description());
    }
}
