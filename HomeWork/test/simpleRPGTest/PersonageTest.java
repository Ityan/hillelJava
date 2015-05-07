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
    public void setWeaponTest() {
        Personage human = new Human();
        Personage ork = new Ork();
        Personage elf = new Elf();

        human.setWeapon(new Sword());
        ork.setWeapon(new Hammer());
        elf.setWeapon(new Bow());

        assertEquals("sword", human.getWeapon().getWeaponType());
        assertEquals("hammer", ork.getWeapon().getWeaponType());
        assertEquals("bow", elf.getWeapon().getWeaponType());
    }

    @Test
    public void getDamageTest() {
        Personage human = new Human();
        Personage ork = new Ork();
        Personage elf = new Elf();

        human.setWeapon(new Sword());
        ork.setWeapon(new Hammer());
        elf.setWeapon(new Bow());


        assertEquals(9, human.getDamage());
        assertEquals(9, ork.getDamage());
        assertEquals(8, elf.getDamage());
    }
}
