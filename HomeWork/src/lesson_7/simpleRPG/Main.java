package lesson_7.simpleRPG;

import lesson_7.simpleRPG.personage.Elf;
import lesson_7.simpleRPG.personage.Human;
import lesson_7.simpleRPG.personage.Ork;
import lesson_7.simpleRPG.personage.Personage;
import lesson_7.simpleRPG.weapon.Bow;
import lesson_7.simpleRPG.weapon.Hammer;
import lesson_7.simpleRPG.weapon.Sword;

/**
 * @author ITyan on 17.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Personage human = new Human();
        Personage ork = new Ork();
        Personage elf = new Elf();

        human.addWeapon(new Sword());
        ork.addWeapon(new Hammer());
        elf.addWeapon(new Bow());

        human.printAttack();
        ork.printAttack();
        elf.printAttack();
    }
}
