package lesson_7.simpleRPG;

/**
 * @author ITyan on 17.05.2015.
 */
public class Weapon {

    private String name;

    private Damage min;

    private Damage max;

    public Weapon(String name) {
        this.name = name;
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

    public void setMin(Damage min) {
        this.min = min;
    }

    public void setMax(Damage max) {
        this.max = max;
    }
}