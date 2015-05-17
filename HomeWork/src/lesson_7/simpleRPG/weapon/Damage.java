package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Damage {

    private int cuttingDamage;
    private int crushingDamage;
    private int distanceDamage;

    public Damage(int cuttingDamage, int crushingDamage, int distanceDamage) {
        this.cuttingDamage = cuttingDamage;
        this.crushingDamage = crushingDamage;
        this.distanceDamage = distanceDamage;
    }

    public void addDamage(Damage d) {
        cuttingDamage += d.cuttingDamage / 2;
        crushingDamage += d.crushingDamage / 2;
        distanceDamage += d.distanceDamage / 2;
    }

    @Override
    public String toString() {
        return "" + (cuttingDamage + crushingDamage +  distanceDamage);
    }
}