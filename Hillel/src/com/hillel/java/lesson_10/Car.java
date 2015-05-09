package com.hillel.java.lesson_10;

/**
 * Created by ITyan on 08.05.2015.
 */
public class Car implements Comparable<Car> {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

//    public void setModel(String model) {
//        this.model = model;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
    }
}
