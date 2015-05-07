package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;

/**
 * @author ITyan on 28.04.2015.
 */
public class Elf extends Personage {

    public Elf() {
        super("Elf");
    }

    @Override
    void calcDamage() {
        Damage elfDamage = new Damage(0, 0, 2);
        getDamage().addDamage(elfDamage);
    }
}
