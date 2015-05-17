package lesson_7.test;

/**
 * Created by Igor on 17.05.2015.
 */
public class Peron {

    private Damage damage;
    private Updatable updatable;

    public void receiveData() {
        damage = new Damage(5, 0, 0);

        mesurementChangment();
    }

    private void mesurementChangment() {
        updatable.update(damage);
    }
}
