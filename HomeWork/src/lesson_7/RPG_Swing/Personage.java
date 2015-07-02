package lesson_7.RPG_Swing;

import java.io.Serializable;

/**
 * @author ITyan on 17.05.2015.
 */
public class Personage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Weapon weapon;
    private Armor armor;
    private Damage bonus;
    private String name;
    private int health;
    private int maxHealth;

    public Personage(String name, Damage bonus, int health) {
        this.name = name;
        this.bonus = bonus;
        this.health = health;
        maxHealth = health;
    }

    public Damage getPersonageDamage() {
        Damage damage = new Damage();
        damage.plus(weapon.getDamage());
        damage.plus(bonus);
        return damage;
    }

    public int takeHealth(Damage damage) {
        int dmg = damage.healthPoints();
        health -= dmg - (dmg / 100 * armor.getDefence());
        return (health * 100 / maxHealth);
    }

    @Override
    public String toString() {
        return "<html>Name: " + name +
                "<li>Weapon: " + weapon.getName() +
                "<li>Armor: " + armor.getName() + "</html>";
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}