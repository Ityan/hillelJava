package RPG_Swing;

import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public class Weapon {

    private String name;
    private Damage min;
    private Damage max;

    private Random random = new Random();

    public Weapon() {

        int randomWeaponChoice = random.nextInt(3);

        if (randomWeaponChoice == 0) {
            name = "Sword";
            min = new Damage(6, 0, 0);
            max = new Damage(9, 0, 0);
        }
        if (randomWeaponChoice == 1) {
            name = "Hammer";
            min = new Damage(0, 7, 0);
            max = new Damage(0, 8, 0);
        }
        if (randomWeaponChoice == 2) {
            name = "Bow";
            min = new Damage(0, 0, 5);
            max = new Damage(0, 0, 10);
        }
    }

    public Damage getDamage() {
        Damage d = new Damage();
        d.plusDamage(max);
        d.minusDamage(min);
        d.multiplyDamage(random.nextDouble());
        d.plusDamage(min);
        return d;
    }

    public String getName() {
        return name;
    }
}