package com.hillel.java.lists.hash;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by ITyan on 13.05.2015.
 */
public class MyHashSet {

    private int arraySize = 3;

    private LinkedList<Object>[] array = new LinkedList[arraySize];

    public MyHashSet() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new LinkedList<>();
        }
    }

    public void add(Object obj) {
        int index = getIndex(obj);
        LinkedList<Object> list = array[index];
        list.add(obj);
    }

    private int getIndex(Object obj) {
        return Math.abs(obj.hashCode() % array.length);
    }

    public boolean contains(Object obj) {
        int index = getIndex(obj);
        LinkedList<Object> list = array[index];

        return list.contains(obj);
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
