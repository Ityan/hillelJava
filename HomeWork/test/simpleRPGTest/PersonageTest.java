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

        assertEquals("Human" ,human.getName());
        assertEquals("Ork" ,ork.getName());
        assertEquals("Elf" ,elf.getName());
    }

    @Test
    public void printAttackTest() {
        Personage human = new Human();
        Personage ork = new Ork();
        Personage elf = new Elf();

        human.addWeapon(new Sword());
        ork.addWeapon(new Hammer());
        elf.addWeapon(new Bow());

        String humanAttack = human.printAttack();
        String orkAttack = ork.printAttack();
        String elfAttack = elf.printAttack();

        assertEquals("Human sword attack", humanAttack);
        assertEquals("Ork hammer attack", orkAttack);
        assertEquals("Elf bow attack", elfAttack);
    }

    @Test
    public void strikeTest() {
        Personage human = new Human();
        Personage ork = new Ork();
        Personage elf = new Elf();

        human.addWeapon(new Sword());
        ork.addWeapon(new Hammer());
        elf.addWeapon(new Bow());

//        assertEquals(7, human.strike());
//        assertEquals(9, ork.strike());
//        assertEquals(10, elf.strike());
    }
}
