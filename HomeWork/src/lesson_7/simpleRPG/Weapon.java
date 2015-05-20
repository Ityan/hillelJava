package lesson_7.simpleRPG;

/**
 * @author ITyan on 17.05.2015.
 */
public class Weapon {

    private Randomable rand;

    private String name;

    private Damage min;
    private Damage max;

    public Weapon(String name, Damage min, Damage max, Randomable randomOrTest) {
        this.name = name;
        this.min = min;
        this.max = max;
        rand = randomOrTest;
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