package lesson_7.simpleRPG.weapon;

import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public class Hammer extends Weapon {

    Damage damage = new Damage(0, getHammerDamage(), 0);

    private int getHammerDamage() {
        Random random = new Random();
        int minDamage = 7;
        int maxDamage = 8;
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