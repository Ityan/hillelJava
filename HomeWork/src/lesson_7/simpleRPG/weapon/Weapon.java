package lesson_7.simpleRPG.weapon;

/**
 * Created by Igor on 17.05.2015.
 */
public abstract class Weapon {

    Damage damage;

    abstract public Damage getDamage();

    abstract public String getName();

    public void addBonus(Damage d) {
        damage = getDamage();
        damage.addDamage(d);
    }
}