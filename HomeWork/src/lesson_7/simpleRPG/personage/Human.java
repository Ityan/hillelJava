package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;

/**
 * @author ITyan on 17.05.2015.
 */
public class Human extends Personage {

    public Human() {
    }

    public Human(double r) {
        super(r);
    }

    @Override
    public String getName() {
        return "Human";
    }

    @Override
    public Damage getBonus() {
        return new Damage(5, 0, 0);
    }
}