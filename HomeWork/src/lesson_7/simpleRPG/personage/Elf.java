package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damageable;

/**
 * @author ITyan on 17.05.2015.
 */
public class Elf extends Personage {

    public Elf(Damageable damageable) {
        super("Elf", damageable);
    }

    @Override
    int getAttack() {
        return 6;
    }
}
