package lesson_7.simpleRPG;

/**
 * @author ITyan on 17.05.2015.
 */
public class Weapon {

    private String name;

    private Damage min;

    private Damage max;

    public Weapon(String name, Damage min, Damage max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    public Damage getDamage(double random) {
        Damage d = new Damage();
        d.plusDamage(max);
        d.minusDamage(min);
        d.multiplyDamage(random);
        d.plusDamage(min);
        return d;
    }

    public String getName() {
        return name;
    }
}