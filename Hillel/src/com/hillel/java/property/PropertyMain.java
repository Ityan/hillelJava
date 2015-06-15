package com.hillel.java.property;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by ITyan on 04.06.2015.
 */
public class PropertyMain {

    public static void main(String[] args) {

        Properties mainProperties = loadProperties("hillel/main_config.properties");
        String file = mainProperties.getProperty("file_to_use");
        Properties properties = loadProperties("hillel/" + file);

        String policeTel = properties.getProperty("police");
        String ambulanceTel = properties.getProperty("ambulance");
        String firestationTel = properties.getProperty("firestation");

        System.out.println("emergency num: " + policeTel + ", " + ambulanceTel + ", " + firestationTel);

    }

    private static Properties loadProperties(String filename) {
        Properties properties = new Properties();

        try (FileReader reader = new FileReader(filename)) {
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return properties;
    }

}
