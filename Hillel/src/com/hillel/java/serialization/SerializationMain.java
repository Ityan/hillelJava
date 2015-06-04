package com.hillel.java.serialization;

import java.io.*;

/**
 * Created by ITyan on 04.06.2015.
 */
public class SerializationMain {

    public static void main(String[] args) {

        Car car = new Car("BMW");

        //save(car);

        car = load();

        System.out.println(car);

    }

    private static Car load() {
        Car car = null;
        try (ObjectInputStream outputStream = new ObjectInputStream(new FileInputStream("hillel/serializedCar.dat"))){
            car = (Car) outputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }

    private static void save(Car car) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hillel/serializedCar.dat"))){
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
