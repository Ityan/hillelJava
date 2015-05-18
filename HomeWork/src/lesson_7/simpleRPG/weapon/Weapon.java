package lesson_7.simpleRPG.weapon;

import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public abstract class Weapon {

    abstract public Damage getDamage();

    abstract public String getName();

    protected int getWeaponDamage(int min, int max) {
        Random random = new Random();
        return (int) Math.round(random.nextDouble() * (max - min) + min);
    }
}