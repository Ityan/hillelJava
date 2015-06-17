package lesson_7.RPG_Swing;

/**
 * @author ITyan on 17.05.2015.
 */
public class Personage {

    private Weapon weapon;
    private Armor armor;
    private Damage bonus;
    private String name;
    private int health;

    public Personage(String name, Damage bonus, int health) {
        this.name = name;
        this.bonus = bonus;
        this.health = health;
    }

    public Damage getPersonageDamage() {
        Damage damage = new Damage();
        damage.plusDamage(weapon.getDamage());
        damage.plusDamage(bonus);
        return damage;
    }

    public int takeHealth(Personage p) {
        int dmg = getPersonageDamage().inHealthBarDamage();
        return (dmg - (dmg / 100 * p.getArmor().getDefence()));
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

    public int getHealth() {
        return health;
    }

    public Armor getArmor() {
        return armor;
    }

    public String getName() {
        return name;
    }
}