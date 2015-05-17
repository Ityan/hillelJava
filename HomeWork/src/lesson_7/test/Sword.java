package lesson_7.test;

/**
 * Created by Igor on 17.05.2015.
 */
public class Sword implements Updatable {

    Damage damage;

    @Override
    public void update(Damage damage) {
        this.damage = damage;
    }
}
