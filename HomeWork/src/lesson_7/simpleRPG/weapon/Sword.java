package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public class Sword extends Weapon {

    public Sword() {
        super("sword");
    }

    @Override
    public Damage getWeaponDamage() {
        return new Damage(7, 0, 0);
    }
}
