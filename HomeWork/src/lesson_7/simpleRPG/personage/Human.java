package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;

/**
 * @author ITyan on 28.04.2015.
 */
public class Human extends Personage {

    public Human() {
        super("Human");
    }

    @Override
    void calcDamage() {
        Damage humanDamage = new Damage(4, 0, 0);
        getDamage().addDamage(humanDamage);
    }
}
