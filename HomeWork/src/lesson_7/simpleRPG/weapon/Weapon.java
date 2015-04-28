package lesson_7.simpleRPG.weapon;

/**
 * Created by Igor on 28.04.2015.
 */
public abstract class Weapon {

    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
