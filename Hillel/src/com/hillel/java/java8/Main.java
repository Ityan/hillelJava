package com.hillel.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

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


        Function<String, String> addHeader = s -> "Hello, " + s;
        UnaryOperator<String> addFooter = s -> s + " Igor";
        Function<String, String> replaceMisprints = s -> s.replace("javav", "java");

        Function<String, String> textProcessor = addHeader.andThen(addFooter).andThen(replaceMisprints);
        System.out.println(textProcessor.apply("I'm learning javav8"));

        textProcessor = addHeader.compose(addFooter).compose(replaceMisprints);

    }

    private static void composingPredicats(List<Apple> apples) {
        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        Predicate<Apple> isHeavy = apple -> apple.getWeight() > 120;
        Predicate<Apple> isHeavyAndGreen = isGreen.and(isHeavy);
        List<Apple> greenAndHeavyApples = filter(apples, isHeavyAndGreen);

        greenAndHeavyApples.forEach(System.out::println);
    }

    private static void replaceApplesWithTwiceLighter(List<Apple> apples) {
        UnaryOperator<Apple> appleReplacer = apple -> new Apple(apple.getWeight() / 2, apple.getColor());
        apples.replaceAll(appleReplacer);

        apples.replaceAll(apple -> new Apple(apple.getWeight() / 2, apple.getColor()));
    }

    private static void replacingConsumerByMethodRef(List<Apple> apples) {
        for (Apple apple : apples) {
            System.out.println(apple);
        }

        apples.forEach(apple -> System.out.println(apple));
        apples.forEach(System.out::println);
    }

    private static void comparingUsingLambdas(List<Apple> apples) {
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

    private static <T> List<T> filter(List<T> items, Predicate<T> predicate) {
        List<T> filteredItems;
        filteredItems = new ArrayList<>();

        for (T i : items) {
            if (predicate.test(i)) {
                filteredItems.add(i);
            }
        }
        return filteredItems;
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
        Comparator<Apple> weightComparator = (Apple o1, Apple o2) -> Integer.compare(o1.getWeight(), o2.getWeight());
        weightComparator = Main::compareApplesByWeight;

        Comparator<Apple> colorComparator = Comparator.comparing(apple -> apple.getColor());
        colorComparator = Comparator.comparing(Apple::getColor);

        Comparator<Apple> compareByWeightThenByColor = weightComparator.thenComparing(colorComparator);

        apples.sort(Comparator.comparingInt(Apple::getWeight).reversed());

        apples.sort(compareByWeightThenByColor);

        apples.forEach(System.out::println);
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
