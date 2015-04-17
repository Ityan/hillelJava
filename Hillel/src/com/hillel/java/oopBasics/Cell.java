package com.hillel.java.oopBasics;

/**
 * Created by ITyan on 17.04.2015.
 */
public class Cell {

    private String value;

    private Cell next;
    private Cell cell;

    public Cell(String value) {
        this.value = value;
    }

    public void setNext(Cell cell) {
        this.next = cell;
    }

    public Cell getNext() {
        return next;
    }

    public String getValue() {
        return value;
    }
}
