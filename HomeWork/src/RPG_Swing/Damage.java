package RPG_Swing;

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

    public void plusDamage(Damage d) {
        cuttingDamage += d.cuttingDamage;
        crushingDamage += d.crushingDamage;
        distanceDamage += d.distanceDamage;
    }

    public void minusDamage(Damage d) {
        cuttingDamage -= d.cuttingDamage;
        crushingDamage -= d.crushingDamage;
        distanceDamage -= d.distanceDamage;
    }

    public void multiplyDamage(double d) {
        cuttingDamage *= d;
        crushingDamage *= d;
        distanceDamage *= d;
    }

    public int inHealthBarDamage() {
        return Math.round(cuttingDamage + crushingDamage + distanceDamage);
    }

    @Override
    public String toString() {
        return "" + (cuttingDamage + crushingDamage + distanceDamage);
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