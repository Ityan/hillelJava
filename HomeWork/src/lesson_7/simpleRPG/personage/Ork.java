package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Hammer;

/**
 * @author ITyan on 28.04.2015.
 */
public class Ork extends Personage {

    public Ork() {
        super("Ork");
    }

    @Override
    void calcDamage() {
        getDamage().setCrushingDamage(getDamage().getCrushingDamage() + 3);
    }
}
