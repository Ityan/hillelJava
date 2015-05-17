package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damageable;

/**
 * @author ITyan on 17.05.2015.
 */
public class Human extends Personage {

    public Human(Damageable weapon) {
        super("Human", weapon);
    }

    @Override
    int getAttack() {
        return 5;
    }
}
