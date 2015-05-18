package lesson_7.simpleRPG.weapon;

import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public interface Weapon {

    Damage getDamage(double random);

    String getName();
}