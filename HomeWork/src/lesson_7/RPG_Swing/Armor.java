package lesson_7.RPG_Swing;

import java.util.Random;

/**
 * @author ITyan 09.06.2015.
 */
public class Armor {

    private String name;
    private int defence;

    public Armor(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }

    public double getDefence() {
        return defence;
    }

    public String getName() {
        return name;
    }
}
