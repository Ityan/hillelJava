package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Bow extends Weapon {

    Damage damage = new Damage(0, 0, 5);

    @Override
    public Damage getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return "bow";
    }
}