package com.hillel.java.java8;

import java.util.Comparator;

/**
 * Created by ITyan on 20.07.2015.
 */
public class AppleComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
