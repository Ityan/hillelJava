package lesson_7.simpleRPG.personage;

/**
 * @author ITyan on 28.04.2015.
 */
public class Human extends Personage {

    private static final int DAMAGE = 4;

    public Human() {
        super("Human");
    }

    public int getDamage() {
        if (getWeapon().getWeaponType().equals("sword")) {
            return getWeapon().getWeaponDamage() + (DAMAGE / 2);
        } else {
            return getWeapon().getWeaponDamage();
        }
    }
}
