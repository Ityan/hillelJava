package lesson_7.RPG_Swing;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

/**
 * @author Igor on 28.06.2015.
 */
public class Battlefield {
    private Properties properties;
    private String FilePath = "HomeWork\\src\\lesson_7\\RPG_Swing\\resources\\";

    private Personage player1;
    private Personage player2;

    private Random random = new Random();

    public Battlefield() {
        createPersonages();
    }

    public void createPersonages() {
        player1 = randomPersonage();
        player1.setWeapon(randomWeapon());
        player1.setArmor(randomArmor());

        player2 = randomPersonage();
        player2.setWeapon(randomWeapon());
        player2.setArmor(randomArmor());
    }

    private Personage randomPersonage() {

        int personageChoice = random.nextInt(3);

        switch (personageChoice) {
            case 0:
                properties = loadProperties(FilePath + "human.properties");
                break;
            case 1:
                properties = loadProperties(FilePath + "ork.properties");
                break;
            case 2:
                properties = loadProperties(FilePath + "elf.properties");
                break;
        }

        String name = properties.getProperty("name");
        int health = Integer.valueOf(properties.getProperty("health"));
        Damage bonus = Damage.valueOf(properties.getProperty("cutting"),
                properties.getProperty("crushing"),
                properties.getProperty("distance"));

        return new Personage(name, bonus, health);
    }

    private Weapon randomWeapon() {

        int randomWeaponChoice = random.nextInt(3);

        if (randomWeaponChoice == 0) {
            properties = loadProperties(FilePath + "sword.properties");
        }
        if (randomWeaponChoice == 1) {
            properties = loadProperties(FilePath + "hammer.properties");
        }
        if (randomWeaponChoice == 2) {
            properties = loadProperties(FilePath + "bow.properties");
        }

        String name = properties.getProperty("name");
        Damage min = Damage.valueOf(properties.getProperty("min_cutting"),
                properties.getProperty("min_crushing"),
                properties.getProperty("min_distance"));
        Damage max = Damage.valueOf(properties.getProperty("max_cutting"),
                properties.getProperty("max_crushing"),
                properties.getProperty("max_distance"));

        return new Weapon(name, min, max);
    }

    private Armor randomArmor() {

        int randomArmorChoice = random.nextInt(3);

        if (randomArmorChoice == 0) {
            properties = loadProperties(FilePath + "helmet.properties");
        }
        if (randomArmorChoice == 1) {
            properties = loadProperties(FilePath + "breastplate.properties");
        }
        if (randomArmorChoice == 2) {
            properties = loadProperties(FilePath + "greaves.properties");
        }

        String name = properties.getProperty("name");
        int defence = Integer.valueOf(properties.getProperty("defence"));

        return new Armor(name, defence);
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

    public Personage getPlayer1() {
        return player1;
    }

    public Personage getPlayer2() {
        return player2;
    }
}
