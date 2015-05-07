package lesson_7.simpleRPG.personage;

/**
 * @author ITyan on 28.04.2015.
 */
public class Human extends Personage {

    public Human() {
        super("Human");
    }

    @Override
    void calcDamage() {
        getDamage().setCuttingDamage(getDamage().getCuttingDamage() + 4);
    }
}
