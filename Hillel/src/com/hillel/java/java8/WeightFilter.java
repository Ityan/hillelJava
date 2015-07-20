package com.hillel.java.java8;

import java.util.function.Predicate;

/**
 * Created by ITyan on 20.07.2015.
 */
public class WeightFilter implements Predicate<Apple> {


    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 120;
    }
}
