package lesson_7.simpleRPG.weapon;

/**
 * @author ITyan on 07.05.2015.
 */
public class Damage {
    private int cuttingDamage;
    private int crushingDamage;
    private int distantDamage;

    public Damage(int cuttingDamage, int crushingDamage, int distantDamage) {
        this.cuttingDamage = cuttingDamage;
        this.crushingDamage = crushingDamage;
        this.distantDamage = distantDamage;
    }

    public void addDamage(Damage damage) {
        this.cuttingDamage += damage.cuttingDamage;
        this.crushingDamage += damage.crushingDamage;
        this.distantDamage += damage.distantDamage;
    }

    public int getAllDamage() {
        return cuttingDamage + crushingDamage + distantDamage;
    }
}
