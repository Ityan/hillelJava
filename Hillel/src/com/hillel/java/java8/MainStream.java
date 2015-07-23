package com.hillel.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by ITyan on 23.07.2015.
 */
public class MainStream {

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
                .collect(Collectors.toList());

        Optional<String> maxColor = apples.parallelStream()
                .filter(apple -> apple.getWeight() > 120)
                .limit(4)
                .map(Apple::getColor)
                .sorted()
                .max(Comparator.naturalOrder());

        System.out.println(maxColor.orElse("none"));
    }

}
