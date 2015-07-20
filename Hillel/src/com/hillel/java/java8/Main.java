package com.hillel.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ITyan on 20.07.2015.
 */
public class Main {

    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

        Comparator<Apple> appleComparator = Main::compareApplesByWeight;

        appleComparator = (Apple o1, Apple o2) -> Integer.compare(o1.getWeight(), o2.getWeight());

        apples.sort(appleComparator);

        System.out.println(apples);

    }

    public static int compareApplesByWeight(Apple o1, Apple o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }

    private static void filterNumbersExample() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        Predicate<Integer> evenFilter = i -> i % 2 == 0;
        List<Integer> evenNumber = filter(integers, evenFilter);

        System.out.println(evenNumber);
    }

    private static void appleExample() {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

        List<Apple> greenApples = filter(apples, new ColorFilter());

        Predicate<Apple> weightFilter = new Predicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 120;
            }
        };
        List<Apple> heavyApples = filter(apples, weightFilter);

        heavyApples = filter(apples, a -> a.getWeight() > 120);
        greenApples = filter(apples, a -> "Green".equals(a.getColor()));

        List<Apple> heavyAndGreensApples = filter(apples, Main::isHeavyAndGreen);

        System.out.println(greenApples);
        System.out.println(heavyApples);
    }

    public static boolean isHeavyAndGreen(Apple apple) {
        return apple.getWeight() > 120 && "Green".equals(apple.getColor());
    }

    private static <T> List<T> filter(List<T> apples, Predicate<T> predicate) {
        List<T> greenApples;
        greenApples = new ArrayList<>();

        for (T apple : apples) {
            if (predicate.test(apple)) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    private static List<Apple> filterGreenApples(List<Apple> apples) {
        List<Apple> greenApples;
        greenApples = new ArrayList<>();

        for (Apple apple : apples) {
            if ("Green".equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    private static List<Apple> filterHeavyApples(List<Apple> apples) {
        List<Apple> greenApples;
        greenApples = new ArrayList<>();

        for (Apple apple : apples) {
            if (120 < apple.getWeight()) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    private static void java8StyleSort(List<Apple> apples) {
        apples.sort(Comparator.comparingInt(Apple::getWeight).reversed());
    }

    private static void oldStyleSort(List<Apple> apples) {
        Comparator<Apple> comparator = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        };

        Collections.sort(apples, comparator);
    }

}
