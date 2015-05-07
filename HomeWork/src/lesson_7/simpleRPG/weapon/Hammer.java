package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public class Hammer extends Weapon {

    private static final int HAMMER_DAMAGE = 8;

    public Hammer() {
        super("hammer");
    }

    @Override
    public int getWeaponDamage() {
        return HAMMER_DAMAGE;
    }
}
