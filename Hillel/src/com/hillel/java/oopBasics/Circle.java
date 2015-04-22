package com.hillel.java.oopBasics;

/**
 * Created by ITyan on 22.04.2015.
 */
public class Circle extends Shape {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * r * r);
    }

    @Override
    public String toString() {
        return "Circle: r = " + r + " " + super.toString();
    }

    @Override
    public String getColor() {
        return "Black";
    }
}
