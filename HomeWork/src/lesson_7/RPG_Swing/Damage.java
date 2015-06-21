package lesson_7.RPG_Swing;

/**
 * @author ITyan on 17.05.2015.
 */
public class Damage {

    private int cuttingDamage;
    private int crushingDamage;
    private int distanceDamage;

    public Damage() {
    }

    public Damage(int cuttingDamage, int crushingDamage, int distanceDamage) {
        this.cuttingDamage = cuttingDamage;
        this.crushingDamage = crushingDamage;
        this.distanceDamage = distanceDamage;
    }

    public void plus(Damage d) {
        cuttingDamage += d.cuttingDamage;
        crushingDamage += d.crushingDamage;
        distanceDamage += d.distanceDamage;
    }

    public void minus(Damage d) {
        cuttingDamage -= d.cuttingDamage;
        crushingDamage -= d.crushingDamage;
        distanceDamage -= d.distanceDamage;
    }

    public void multiply(double d) {
        cuttingDamage *= d;
        crushingDamage *= d;
        distanceDamage *= d;
    }

    public int healthPoints() {
        return cuttingDamage + crushingDamage + distanceDamage;
    }

    @Override
    public String toString() {
        return "" + healthPoints();
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