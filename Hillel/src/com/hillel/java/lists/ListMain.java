package com.hillel.java.lists;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ITyan on 24.04.2015.
 */
public class ListMain {
    public static void main(String[] args) {

//        List list = new LinkedList();
//        list.add("asd");
//        list.add("sdf");
//
//        for (Object o : list) {
//            System.out.println(o);
//        }

        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add("asd");
        improvedArray.add("sdf");

        for (Object o : improvedArray) {
            System.out.println(o);
        }
    }
}
