package lesson_7.simpleRPG.weapon;

/**
 * @author Ityan on 17.05.2015.
 */
public class Sword extends Weapon {

    Damage damage = new Damage(6, 0, 0);

    @Override
    public Damage getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return "sword";
    }

}