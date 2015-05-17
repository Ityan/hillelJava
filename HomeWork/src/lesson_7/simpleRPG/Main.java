package lesson_7.simpleRPG;

import lesson_7.simpleRPG.personage.Human;
import lesson_7.simpleRPG.personage.Ork;
import lesson_7.simpleRPG.personage.Personage;
import lesson_7.simpleRPG.weapon.Hammer;
import lesson_7.simpleRPG.weapon.Sword;

import java.util.Random;

/**
 * Created by Igor on 17.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Personage human = new Human();
        Personage ork = new Ork();

        human.addWeapon(new Sword());
        human.printAttack();

        ork.addWeapon(new Hammer());
        ork.printAttack();
    }
}
