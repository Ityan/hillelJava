package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public abstract class Weapon {

    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    abstract public Damage getWeaponDamage();
}
