package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Hammer implements Weapon {

    @Override
    public Damage getDamage(double random) {
        int min = 7;
        int max = 8;
        int r = (int) (random * (max - min) + min);
        return new Damage(r, 0, 0);
    }

    @Override
    public String getName() {
        return "hammer";
    }
}