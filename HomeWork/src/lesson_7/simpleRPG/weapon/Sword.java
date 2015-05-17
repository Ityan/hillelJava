package lesson_7.simpleRPG.weapon;

import java.util.Random;

/**
 * @author Ityan on 17.05.2015.
 */
public class Sword extends Weapon {

    private static int minDamage = 6;
    private static int maxDamage = 9;

    Damage damage = new Damage(getSwordDamage(), 0, 0);

    private int getSwordDamage() {
        Random random = new Random();
        return (int) Math.round(random.nextDouble() * (maxDamage - minDamage) + minDamage);
    }

    @Override
    public Damage getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return "sword";
    }

}