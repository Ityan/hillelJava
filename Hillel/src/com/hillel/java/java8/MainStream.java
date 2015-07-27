package com.hillel.java.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ITyan on 23.07.2015.
 */
public class MainStream {

    /**
     * this is main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(100, "Green"));
        apples.add(new Apple(150, "Yellow"));
        apples.add(new Apple(130, "Green"));
        apples.add(new Apple(150, "Red"));

        List<String> appleColor = apples.parallelStream()
                .filter(apple -> apple.getWeight() > 120)
                .limit(1)
                .map(Apple::getColor)
                .sorted()
                .collect(Collectors.toList()); //терминальный оператор
        System.out.println(appleColor);

        Optional<String> maxColor = apples.parallelStream()
                .filter(apple -> apple.getWeight() > 120)
                .limit(4)
                .map(Apple::getColor)
                .sorted()
                .max(Comparator.naturalOrder()); //терминальный оператор
        System.out.println(maxColor.orElse("none"));

        Random random = new Random();
        int result = Stream.generate(random::nextInt)
                .limit(10)
                .mapToInt(value -> value)
                .min() //терминальный оператор
                .orElse(0);
        System.out.println(result);

        System.out.println("Contains at least one green apple: " +
                        apples.stream()
                                .anyMatch(apple -> apple.getColor().equals("Green"))
        );

        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        Predicate<Apple> isYellow = apple -> apple.getColor().equals("Yellow");
        Predicate<Apple> isYellowOrGreen = isYellow.or(isGreen);
        System.out.println("Contains only green or yellow apples: " +
                        apples.stream()
                                .anyMatch(isYellowOrGreen)
        );

        apples.stream().forEach(System.out::println);
    }


}
