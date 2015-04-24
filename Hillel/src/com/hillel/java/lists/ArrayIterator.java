package com.hillel.java.lists;

import java.util.Iterator;
import java.util.Objects;

/**
 * Created by ITyan on 24.04.2015.
 */
public class ArrayIterator implements Iterator{

    private ImprovedArray improvedArray;
    private int nextIndex;

    public ArrayIterator(ImprovedArray improvedArray) {
        this.improvedArray = improvedArray;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < improvedArray.size();
    }

    @Override
    public Object next() {
        Object next = improvedArray.get(nextIndex);
        nextIndex++;
        return next;
    }
}
