package simpleRPGTest;

import lesson_7.simpleRPG.personage.Elf;
import lesson_7.simpleRPG.personage.Human;
import lesson_7.simpleRPG.personage.Ork;
import lesson_7.simpleRPG.personage.Personage;
import lesson_7.simpleRPG.weapon.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ITyan on 28.04.2015.
 */
public class PersonageTest {

    @Test
    public void getPersonageDamageTest() {
        Personage human = new Human();
        Personage ork = new Ork();
        Personage elf = new Elf();

        Weapon sword = new Sword();
        Weapon hammer = new Hammer();
        Weapon bow = new Bow();

        human.addWeapon(sword);
        ork.addWeapon(hammer);
        elf.addWeapon(bow);



        Damage h = human.getPersonageDamage();
        Damage o = ork.getPersonageDamage();
        Damage e = elf.getPersonageDamage();
    }

}