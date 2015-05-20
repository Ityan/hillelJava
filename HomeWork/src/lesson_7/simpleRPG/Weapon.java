package lesson_7.simpleRPG;

/**
 * @author ITyan on 17.05.2015.
 */
public class Weapon {

    private TestAndRandom rand;

    private String name;

    private Damage min;
    private Damage max;

    public Weapon(String name, Damage min, Damage max, TestAndRandom rand) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.rand = rand;
    }

    public Damage getDamage() {
        Damage d = new Damage();
        d.plusDamage(max);
        d.minusDamage(min);
        d.multiplyDamage(rand.random());
        d.plusDamage(min);
        return d;
    }

    public String getName() {
        return name;
    }
}