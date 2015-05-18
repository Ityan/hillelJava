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
        Personage human = new Human(1);
        Personage ork = new Ork(1);
        Personage elf = new Elf(1);

        human.addWeapon(new Sword());
        ork.addWeapon(new Hammer());
        elf.addWeapon(new Bow());

        String h = human.getPersonageDamage().toString();
        String o = ork.getPersonageDamage().toString();
        String e = elf.getPersonageDamage().toString();

        assertEquals("14", h);
        assertEquals("12", o);
        assertEquals("16", e);
    }

}