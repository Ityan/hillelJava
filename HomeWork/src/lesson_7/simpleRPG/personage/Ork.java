package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;

/**
 * @author ITyan on 17.05.2015.
 */
public class Ork extends Personage {

    public Ork() {
    }

    public Ork(double r) {
        super(r);
    }

    @Override
    public String getName() {
        return "Ork";
    }

    @Override
    public Damage getBonus() {
        return new Damage(0, 4, 0);
    }
}