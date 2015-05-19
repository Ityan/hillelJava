package lesson_7.simpleRPG.weapon;

import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public abstract class Weapon {

    abstract public Damage getDamage(double random);

    abstract public String getName();
}