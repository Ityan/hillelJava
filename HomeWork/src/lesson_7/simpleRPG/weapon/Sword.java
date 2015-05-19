package lesson_7.simpleRPG.weapon;

/**
 * @author Ityan on 17.05.2015.
 */
public class Sword extends Weapon {

    @Override
    public Damage getDamage(double random) {
        int min = 6;
        int max = 9;
        int r = (int) (random * (max - min) + min);
        return new Damage(r, 0, 0);
    }

    @Override
    public String getName() {
        return "sword";
    }
}