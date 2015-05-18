package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Hammer extends Weapon {

    private static final int MIN_DAMAGE = 7;
    private static final int MAX_DAMAGE = 8;

    @Override
    public Damage getDamage() {
        return new Damage(0, getRandom(MIN_DAMAGE, MAX_DAMAGE), 0);
    }

    @Override
    public String getName() {
        return "hammer";
    }
}