package lesson_7.simpleRPG.weapon;

import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public class Hammer extends Weapon {

    private static int minDamage = 7;
    private static int maxDamage = 8;

    Damage damage = new Damage(0, getHammerDamage(), 0);

    private int getHammerDamage() {
        Random random = new Random();
        return (int) Math.round(random.nextDouble() * (maxDamage - minDamage) + minDamage);
    }

    @Override
    public Damage getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return "hammer";
    }
}