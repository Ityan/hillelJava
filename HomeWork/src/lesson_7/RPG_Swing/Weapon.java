package lesson_7.RPG_Swing;

import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public class Weapon {

    private String name;
    private Damage min;
    private Damage max;

    private Random random = new Random();

    public Weapon(String name, Damage min, Damage max) {
        this.name = name;
        this.min = min;
        this.max = max;
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