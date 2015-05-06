package com.hillel.java.lesson_9.comperison;

/**
 * Created by ITyan on 06.05.2015.
 */
public class ExpensiveVine extends Vine {
    public ExpensiveVine(int year, int price) {
        super(year, price);
    }

    @Override
    public String taste() {
        return "Belissimo!";
    }
}
