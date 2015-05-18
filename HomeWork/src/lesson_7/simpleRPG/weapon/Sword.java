package lesson_7.simpleRPG.weapon;

/**
 * @author Ityan on 17.05.2015.
 */
public class Sword extends Weapon {

    private static final int MIN_DAMAGE = 6;
    private static final int MAX_DAMAGE = 9;

    @Override
    public Damage getDamage() {
        return new Damage(getRandom(MIN_DAMAGE, MAX_DAMAGE), 0, 0);
    }

    @Override
    public String getName() {
        return "sword";
    }
}