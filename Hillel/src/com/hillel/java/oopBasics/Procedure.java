package com.hillel.java.oopBasics;

import java.util.Arrays;

/**
 * Created by ITyan on 10.04.2015.
 */
public class Procedure {

    static String[] vetList = new String[10];
    static int registered = 0;

    public static void main(String[] args) {
        String cat1name = "Tom";
        int cat1age = 2;

        String cat2name = "Murzik";
        int cat2age = 1;

        registerCat(cat1name, cat2age);

        printRegisteredCats();
    }

    public static void printRegisteredCats() {
        System.out.println(Arrays.toString(vetList));
    }

    public static void registerCat(String catName, int catAge) {
        vetList[registered] = catName + " " + catAge;
        registered++;
    }
}
