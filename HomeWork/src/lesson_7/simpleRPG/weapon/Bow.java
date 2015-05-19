package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Bow extends Weapon {

    @Override
    public Damage getDamage(double random) {
        int min = 5;
        int max = 10;
        int r = (int) (random * (max - min) + min);
        return new Damage(0, 0, r);
    }

    @Override
    public String getName() {
        return "bow";
    }
}