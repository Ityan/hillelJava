package lesson_7.simpleRPG.weapon;

import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public class Bow extends Weapon {

    private static int minDamage = 5;
    private static int maxDamage = 10;

    Damage damage = new Damage(0, 0, getBowDamage());

    private int getBowDamage() {
        Random random = new Random();
        return (int) Math.round(random.nextDouble() * (maxDamage - minDamage) + minDamage);
    }

    @Override
    public Damage getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return "bow";
    }
}