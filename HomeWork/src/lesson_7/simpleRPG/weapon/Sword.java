package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public class Sword extends Weapon {

    private static final int SWORD_DAMAGE = 7;

    public Sword() {
        super("sword");
    }

    @Override
    public int getWeaponDamage() {
        return SWORD_DAMAGE;
    }
}
