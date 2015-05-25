package com.hillel.java.exception;

/**
 * Created by ITyan on 25.05.2015.
 */
public class ExceptionMain {

    public static void main(String[] args) {

        tryToDivide(5, 1);
        tryToDivide(5, 0);
        tryToDivide(null, 2);
        System.out.println("in the end");
    }

    private static void tryToDivide(Integer a, Integer b) {
        try {
            System.out.println(division(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    private static int division(Integer a, Integer b) {
        if (b == 0) {
            throw new ArithmeticException("division by zero: " + a + " / " + b);
        }
        return a / b;
    }

}
