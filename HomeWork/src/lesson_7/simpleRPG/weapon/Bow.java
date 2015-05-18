package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Bow extends Weapon {

    private static final int MIN_DAMAGE = 5;
    private static final int MAX_DAMAGE = 10;

    @Override
    public Damage getDamage() {
        return new Damage(0, 0, getRandom(MIN_DAMAGE, MAX_DAMAGE));
    }

    @Override
    public String getName() {
        return "bow";
    }
}