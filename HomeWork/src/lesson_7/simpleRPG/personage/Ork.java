package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;

/**
 * @author ITyan on 28.04.2015.
 */
public class Ork extends Personage {

    public Ork() {
        super("Ork");
    }

    @Override
    void calcDamage() {
        Damage orkDamage = new Damage(0, 3, 0);
        getDamage().addDamage(orkDamage);
    }
}
