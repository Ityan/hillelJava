package com.hillel.java.lesson_8.comperison;

/**
 * Created by ITyan on 29.04.2015.
 */
public class Vine implements Comparable<Vine>{

    private int year;
    private int price;

    public Vine(int year, int price) {
        this.year = year;
        this.price = price;
    }

    //контракт методов - определенные требование к написанию(переопределению) методов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Vine)) {
            return false;
        }
        Vine other = (Vine) obj;

        return this.year == other.year;
    }

    @Override
    public int compareTo(Vine bottle2) {
        return this.year - bottle2.year;
    }

    @Override
    public String toString() {
        return "Vine year: " + year + " price: " + price;
    }

    public int getPrice() {
        return price;
    }
}
