package lesson_7.simpleRPG;

/**
 * @author ITyan on 17.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Personage human = new Personage("Human", new Damage(4, 0, 0));

        Weapon sword = new Weapon("sword", new Damage(6, 0, 0), new Damage(9, 0, 0));

        human.addWeapon(sword);

        human.printAttack();
    }
}
