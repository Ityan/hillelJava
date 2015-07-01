package lesson_7.RPG_Swing;

import java.io.Serializable;

/**
 * @author ITyan 09.06.2015.
 */
public class Armor implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int defence;

    public Armor(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public String getName() {
        return name;
    }
}
