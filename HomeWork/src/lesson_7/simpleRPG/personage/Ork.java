package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damageable;

/**
 * @author ITyan on 17.05.2015.
 */
public class Ork extends Personage {

    public Ork(Damageable damageable) {
        super("Elf", damageable);
    }

    @Override
    int getAttack() {
        return 4;
    }
}
