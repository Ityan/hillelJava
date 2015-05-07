package lesson_7.simpleRPG.personage;

/**
 * @author ITyan on 28.04.2015.
 */
public class Elf extends Personage {

    private static final int DAMAGE = 5;

    public Elf() {
        super("Elf");
    }

    @Override
    public int getDamage() {
        if (getWeapon().getWeaponType().equals("bow")) {
            return getWeapon().getWeaponDamage() + (DAMAGE / 2);
        } else {
            return getWeapon().getWeaponDamage();
        }
    }
}
