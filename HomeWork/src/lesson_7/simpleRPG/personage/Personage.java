package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;
import lesson_7.simpleRPG.weapon.Weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public abstract class Personage {

    private Weapon weapon;

    abstract public String getName();
    
    abstract public Damage getBonus();

    public void addWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Damage getPersonageDamage() {
        Damage damage = new Damage();
        damage.addDamage(weapon.getDamage());
        damage.addDamage(getBonus());
        return damage;
    }

    public void printAttack() {
        System.out.println("Race: " + getName() + "\nWeapon: " +
                weapon.getName() + "\nDamage: " + getPersonageDamage());
    }
}