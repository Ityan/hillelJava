package lesson_7.RPG_Swing;

import java.io.*;
import java.util.Properties;
import java.util.Random;

/**
 * @author Igor on 28.06.2015.
 */
public class GameBuilder implements Serializable{

    private static final long serialVersionUID = 1L;

    private Personage player1;
    private Personage player2;
    private boolean p1ReadyToAttack = true;
    private boolean p2ReadyToAttack = false;

    private Properties properties;
    private String filePath = "HomeWork\\src\\lesson_7\\RPG_Swing\\resources\\";

    private Random random = new Random();

    public GameBuilder() {
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
                properties = loadProperties(filePath + "human.properties");
                break;
            case 1:
                properties = loadProperties(filePath + "ork.properties");
                break;
            case 2:
                properties = loadProperties(filePath + "elf.properties");
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

        switch (randomWeaponChoice) {
            case 0:
                properties = loadProperties(filePath + "sword.properties");
                break;
            case 1:
                properties = loadProperties(filePath + "hammer.properties");
                break;
            case 2:
                properties = loadProperties(filePath + "bow.properties");
                break;
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

        switch (randomArmorChoice) {
            case 0:
                properties = loadProperties(filePath + "helmet.properties");
                break;
            case 1:
                properties = loadProperties(filePath + "breastplate.properties");
                break;
            case 2:
                properties = loadProperties(filePath + "greaves.properties");
                break;
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

    public static void save(GameBuilder game) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("HomeWork\\src\\lesson_7\\RPG_Swing" +
                "\\resources\\serializedBattlefield.dat"))) {
            outputStream.writeObject(game);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameBuilder load() {
        GameBuilder game = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("HomeWork\\src\\lesson_7\\RPG_Swing" +
                "\\resources\\serializedBattlefield.dat"))) {
            game = (GameBuilder) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return game;
    }

    public Personage getPlayer1() {
        return player1;
    }

    public Personage getPlayer2() {
        return player2;
    }

    public boolean isP1ReadyToAttack() {
        return p1ReadyToAttack;
    }

    public boolean isP2ReadyToAttack() {
        return p2ReadyToAttack;
    }

    public void setP1ReadyToAttack(boolean p1ReadyToAttack) {
        this.p1ReadyToAttack = p1ReadyToAttack;
    }

    public void setP2ReadyToAttack(boolean p2ReadyToAttack) {
        this.p2ReadyToAttack = p2ReadyToAttack;
    }
}
