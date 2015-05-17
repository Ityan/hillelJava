package lesson_7.test;

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

    public int getCuttingDamage() {
        return cuttingDamage;
    }

    public int getCrushingDamage() {
        return crushingDamage;
    }

    public int getDistanceDamage() {
        return distanceDamage;
    }
}