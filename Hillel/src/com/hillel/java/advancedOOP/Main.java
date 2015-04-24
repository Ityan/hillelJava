package com.hillel.java.advancedOOP;

import com.hillel.java.advancedOOP.duck.*;

/**
 * Created by ITyan on 24.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoy = new DecoyDuck();

        test(redheadDuck);
        test(mallardDuck);
        test(rubberDuck);
        test(decoy);
    }

    public static void test(Duck duck) {
        System.out.println(duck.display());
        System.out.println(duck.fly());
        System.out.println(duck.swim());
        System.out.println(duck.quack());
        System.out.println();
    }
}
