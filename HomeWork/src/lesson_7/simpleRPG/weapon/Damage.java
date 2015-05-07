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

    public int getAllDamage() {
        return cuttingDamage + crushingDamage + distantDamage;
    }


    public int getCuttingDamage() {
        return cuttingDamage;
    }

    public int getCrushingDamage() {
        return crushingDamage;
    }

    public int getDistantDamage() {
        return distantDamage;
    }

    public void setCuttingDamage(int cuttingDamage) {
        this.cuttingDamage = cuttingDamage;
    }

    public void setCrushingDamage(int crushingDamage) {
        this.crushingDamage = crushingDamage;
    }

    public void setDistantDamage(int distantDamage) {
        this.distantDamage = distantDamage;
    }
}
