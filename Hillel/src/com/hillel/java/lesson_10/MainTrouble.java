package com.hillel.java.lesson_10;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ITyan on 08.05.2015.
 */
public class MainTrouble {
    public static void main(String[] args) {
        Set<Car> dreams = new TreeSet<>();
        Car ivanDream = new Car("BMW");
        Car petrDream = new Car("Audi");
        Car tarasDream = new Car("Merc");

        dreams.add(ivanDream);
        dreams.add(petrDream);
        dreams.add(tarasDream);

        System.out.println(dreams);
        System.out.println("petro dream: " + dreams.contains(petrDream));

        dreams.remove(petrDream);
        petrDream = new Car("Kalina");
        dreams.add(petrDream);
        System.out.println(dreams);
        System.out.println("petro dream: " + dreams.contains(petrDream));
    }

    public static void arrayCopyTrouble() {
        int[] source = {8, 5, 2, 1};
        int[] copy = Arrays.copyOf(source, source.length);

        int[] sorted = sort(source);

        System.out.println("source: " + Arrays.toString(source));
        System.out.println("copy: " + Arrays.toString(copy));
        System.out.println("sorted: " + Arrays.toString(sorted));
    }

    public static int[] sort(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);

        Arrays.sort(sorted);
        return sorted;
    }
}
