package lesson_7.simpleRPG;


/**
 * @author ITyan on 17.05.2015.
 */
public  class Personage {

    private Weapon weapon;
    private Damage bonus;
    private String name;

    public Personage(String name, Damage bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public void addWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Damage getPersonageDamage() {
        Damage damage = new Damage();
        damage.plusDamage(weapon.getDamage());
        damage.plusDamage(bonus);
        return damage;
    }

    public void printAttack() {
        System.out.println("Race: " + name + "\nWeapon: " +
                weapon.getName() + "\nDamage: " + getPersonageDamage());
        System.out.println();
    }
}