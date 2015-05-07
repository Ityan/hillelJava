package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public abstract class Weapon {

    private String weaponType;

    public Weapon(String weaponType) {
        this.weaponType = weaponType;
    }

    abstract public int getWeaponDamage();

    public String getWeaponType() {
        return weaponType;
    }
}
