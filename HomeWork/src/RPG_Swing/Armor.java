package RPG_Swing;

import java.util.Random;

/**
 * @author ITyan 09.06.2015.
 */
public class Armor {

    private String name;
    private double defence;

    public Armor() {
        Random random = new Random();
        int randomArmorChoice = random.nextInt(3);

        if (randomArmorChoice == 0) {
            name = "Helmet";
            defence = 7;
        }
        if (randomArmorChoice == 1) {
            name = "Breastplate";
            defence = 14;
        }
        if (randomArmorChoice == 2) {
            name = "Greaves";
            defence = 10;
        }
    }

    public double getDefence() {
        return defence;
    }

    public String getName() {
        return name;
    }
}
