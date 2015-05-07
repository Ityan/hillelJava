package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;
import lesson_7.simpleRPG.weapon.Weapon;

import java.util.Date;

/**
 * @author ITyan on 28.04.2015.
 */
public abstract class Personage {

    private String name;
    private Weapon weapon;
    private Damage damage;

    public Personage(String name) {
        this.name = name;
    }

    abstract void calcDamage();

    public int getAttack() {
        calcDamage();
        return damage.getAllDamage();
    }

    public String getName() {
        return name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        damage = weapon.getWeaponDamage();
    }

    public Damage getDamage() {
        return damage;
    }
}
