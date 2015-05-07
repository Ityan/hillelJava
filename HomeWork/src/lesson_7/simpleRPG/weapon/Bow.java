package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public class Bow extends Weapon {

    private static final int BOW_DAMAGE = 6;

    public Bow() {
        super("bow");
    }

    @Override
    public int getWeaponDamage() {
        return BOW_DAMAGE;
    }
}
