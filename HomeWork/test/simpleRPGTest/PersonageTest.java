package simpleRPGTest;


import lesson_7.simpleRPG.personage.Elf;
import lesson_7.simpleRPG.personage.Human;
import lesson_7.simpleRPG.personage.Ork;
import lesson_7.simpleRPG.personage.Personage;
import lesson_7.simpleRPG.weapon.Bow;
import lesson_7.simpleRPG.weapon.Hammer;
import lesson_7.simpleRPG.weapon.Sword;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor on 28.04.2015.
 */
public class PersonageTest {
    @Test
    public void getNameTest() {
        Personage human = new Human();
        Personage ork = new Ork();
        Personage elf = new Elf();

        assertEquals("Human", human.getName());
        assertEquals("Ork", ork.getName());
        assertEquals("Elf", elf.getName());
    }

    @Test
    public void getDamageTest() {
        Personage human = new Human();
        Personage ork = new Ork();
        Personage elf = new Elf();

        human.setWeapon(new Sword());
        ork.setWeapon(new Hammer());
        elf.setWeapon(new Bow());


        assertEquals(11, human.getAttack());
        assertEquals(10, ork.getAttack());
        assertEquals(7, elf.getAttack());
    }
}
