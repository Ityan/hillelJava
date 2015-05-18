package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;
import lesson_7.simpleRPG.weapon.Weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Elf extends Personage {

    public Elf() {
    }

    public Elf(double r) {
        super(r);
    }

    @Override
    public String getName() {
        return "Elf";
    }

    @Override
    public Damage getBonus() {
        return new Damage(0, 0, 6);
    }
}