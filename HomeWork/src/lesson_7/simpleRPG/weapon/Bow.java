package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public class Bow extends Weapon {

    public Bow() {
        super("bow");
    }

    @Override
    public Damage getWeaponDamage() {
        return new Damage(0, 0, 5);
    }
}
