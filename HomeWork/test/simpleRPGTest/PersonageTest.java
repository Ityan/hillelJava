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
 * @author ITyan on 28.04.2015.
 */
public class PersonageTest {

    @Test
    public void getPersonageDamageTest() {

        Personage human = new Human(new Sword());
        Personage elf = new Elf(new Bow());
        Personage ork = new Ork(new Hammer());

        int hAttack = human.getPersonageDamage();
        int eAttack = elf.getPersonageDamage();
        int oAttack = ork.getPersonageDamage();

        assertEquals(8, hAttack);
        assertEquals(8, eAttack);
        assertEquals(9, oAttack);
    }

}
