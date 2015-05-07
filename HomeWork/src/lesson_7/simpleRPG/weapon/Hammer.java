package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public class Hammer extends Weapon {

    public Hammer() {
        super("hammer");
    }

    @Override
    public Damage getWeaponDamage() {
        return new Damage(0, 7, 0);
    }
}
