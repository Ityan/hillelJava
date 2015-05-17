package lesson_7.simpleRPG.weapon;

/**
 * @author Ityan on 17.05.2015.
 */
public class Sword implements Damageable {

    @Override
    public Damage getDamage() {
        return new Damage(6, 0, 0);
    }

    @Override
    public String getName() {
        return "sword";
    }
}
