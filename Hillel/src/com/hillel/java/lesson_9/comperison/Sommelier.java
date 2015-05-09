package com.hillel.java.lesson_9.comperison;

import java.util.*;

/**
 * @author ITyan  on 29.04.2015.
 */
public class Sommelier {
    public static void main(String[] args) {
        //oldStaff();

        List<Vine> store = new ArrayList<Vine>();
        store.add(new Vine(1999, 200));
        store.add(new Vine(1995, 250));
        store.add(new Vine(1995, 250));
        store.add(new ExpensiveVine(1965, 2000));
        store.add(new CheapVine(2014, 15));
        store.add(new CheapVine(2014, 25));

        //printTaste(store);

        print(store);

        Set<Vine> menu = new TreeSet<Vine>();

        System.out.println("Menu:");
        menu.addAll(store);
        print(menu);

        Set<Vine> orderByPrice = new TreeSet<Vine>(new OrderByPriceYear());

        orderByPrice.addAll(store);
        System.out.println("Menu order:");
        print(orderByPrice);
    }

    public static void print(Iterable<Vine> vines) {
        for (Vine vine : vines) {
            System.out.println(vine);
        }
    }

    public static void printTaste(List<Vine> vines) {
        //вызов iteratora
        Iterator<Vine> iterator = vines.iterator();
        while (iterator.hasNext()) {
            Vine vine = iterator.next();
            System.out.println(vine.taste());
        }
        //мы придумали
        for (Vine vine : vines) {
            System.out.println(vine.taste());
        }
    }

    public static void oldStaff() {
        Vine bottle1 = new Vine(1995, 200);
        Vine bottle2 = new Vine(1995, 100);

        System.out.println("they are equal: " + bottle1.equals(bottle2));
        System.out.println("1 greater than 2 " + (bottle1.compareTo(bottle2) > 0));

        List<Vine> list = new ArrayList<Vine>();

        list.add(bottle1);
        list.add(bottle2);
        list.add(bottle1);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Comparator<Vine> orderByPrice = new OrderByPriceYear();
        Collections.sort(list, orderByPrice);
        System.out.println(list);
    }
}
