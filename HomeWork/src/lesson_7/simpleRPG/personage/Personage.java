package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Damage;
import lesson_7.simpleRPG.weapon.Damageable;

/**
 * @author ITyan on 17.05.2015.
 */
public abstract class Personage {

    private String name;

    private Damage damage;
    private Damageable weapon;

    public Personage(String name, Damageable weapon) {
        this.name = name;
        this.weapon = weapon;
        damage = weapon.getDamage();
    }

    abstract int getAttack();

    public int getPersonageDamage() {
        int cutting = damage.getCuttingDamage();
        int crushing = damage.getCrushingDamage();
        int distance = damage.getDistanceDamage();

        return cutting + crushing + distance + (getAttack() / 2);
    }

    public void printAttack() {
        System.out.println("Race: " + name + "\nWeapon: " +
                weapon.getName() + "\nDamage: " + getPersonageDamage());
    }
}
