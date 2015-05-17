package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Hammer implements Damageable {

    @Override
    public Damage getDamage() {
        return new Damage(0, 7, 0);
    }

    @Override
    public String getName() {
        return "hammer";
    }
}
