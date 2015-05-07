package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Weapon;

/**
 * @author ITyan on 28.04.2015.
 */
public abstract class Personage {

    private String name;
    private Weapon weapon;

    public Personage(String name) {
        this.name = name;
    }

    abstract public int getDamage();

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printAttack() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String result = getName() + " takes the " + weapon.getWeaponType() +
                " and strikes " + getDamage() + " points!";
        return result;
    }
}
