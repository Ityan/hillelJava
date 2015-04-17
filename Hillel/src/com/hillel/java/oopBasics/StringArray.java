package com.hillel.java.oopBasics;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by ITyan on 17.04.2015.
 */
public class StringArray {

    private String[] array = new String[1];

    private int counter = 0;

    public void add(String value) {
        if (array.length == counter) {
            resize();
        }
        array[counter] = value;
        counter++;
    }

    public String get(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + counter);
        }
        return array[index];
    }

    private void resize() {
       array = Arrays.copyOf(array, array.length * 2);
    }

    public int size() {
        return counter;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StringArray)){
            return false;
        }
        StringArray other = (StringArray) obj;

        if (this.size() != other.size()) {
            return false;
        }

        for (int i = 0; i < size(); i++) {
            if (!(this.get(i).equals(other.get(i)))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < size(); i++) {
            result += get(i);
            if (i + 1 < size()) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
