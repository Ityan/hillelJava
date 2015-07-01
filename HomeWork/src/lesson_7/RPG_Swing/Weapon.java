package lesson_7.RPG_Swing;

import java.io.Serializable;
import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public class Weapon implements Serializable{

    private static final long serialVersionUID = 1L;

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
        d.plus(max);
        d.minus(min);
        d.multiply(random.nextDouble());
        d.plus(min);
        return d;
    }

    public String getName() {
        return name;
    }
}