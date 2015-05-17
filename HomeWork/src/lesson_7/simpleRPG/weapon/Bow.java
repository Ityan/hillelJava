package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Bow implements Damageable {

    @Override
    public Damage getDamage() {
        return new Damage(0, 0, 5);
    }

    @Override
    public String getName() {
        return "bow";
    }
}
