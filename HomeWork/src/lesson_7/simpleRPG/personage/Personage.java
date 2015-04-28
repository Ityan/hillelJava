package lesson_7.simpleRPG.personage;

import lesson_7.simpleRPG.weapon.Weapon;

/**
 * Created by Igor on 28.04.2015.
 */
public  class Personage {

    private String name;
    private Weapon weapon;

    public Personage(String name) {
        this.name = name;
    }

    public void addWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printAttack() {
        return getName() + " " + getWeapon() + " attack";
    }

    public String getWeapon() {
        return weapon.getName();
    }

    public String getName() {
        return name;
    }
}
