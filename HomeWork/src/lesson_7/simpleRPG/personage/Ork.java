package lesson_7.simpleRPG.personage;

/**
 * @author ITyan on 28.04.2015.
 */
public class Ork extends Personage {

    private static final int DAMAGE = 3;

    public Ork() {
        super("Ork");
    }

    @Override
    public int getDamage() {
        if (getWeapon().getWeaponType().equals("hammer")) {
            return getWeapon().getWeaponDamage() + (DAMAGE / 2);
        } else {
            return getWeapon().getWeaponDamage();
        }
    }
}
