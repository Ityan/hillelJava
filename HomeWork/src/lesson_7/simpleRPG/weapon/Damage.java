package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 17.05.2015.
 */
public class Damage {

    private int cuttingDamage;
    private int crushingDamage;
    private int distanceDamage;

    public Damage() {
        cuttingDamage = 0;
        crushingDamage = 0;
        distanceDamage = 0;
    }

    public Damage(int cuttingDamage, int crushingDamage, int distanceDamage) {
        this.cuttingDamage = cuttingDamage;
        this.crushingDamage = crushingDamage;
        this.distanceDamage = distanceDamage;
    }

    public void addDamage(Damage d) {
        cuttingDamage += d.cuttingDamage;
        crushingDamage += d.crushingDamage;
        distanceDamage += d.distanceDamage;
    }

    @Override
    public String toString() {
        return "" + (cuttingDamage + crushingDamage +  distanceDamage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Damage damage = (Damage) o;

        if (cuttingDamage != damage.cuttingDamage) return false;
        if (crushingDamage != damage.crushingDamage) return false;
        return distanceDamage == damage.distanceDamage;

    }
}