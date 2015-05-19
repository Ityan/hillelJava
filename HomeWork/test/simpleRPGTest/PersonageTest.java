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

        human.addWeapon(new Sword());
        ork.addWeapon(new Hammer());
        elf.addWeapon(new Bow());

        Damage humanD = new Damage(14, 0, 0);
        Damage orkD = new Damage(0, 13, 0);
        Damage elfD = new Damage(0, 0, 16);

        Damage h = human.getPersonageDamage(1);
        Damage o = ork.getPersonageDamage(1);
        Damage e = elf.getPersonageDamage(1);

        assertEquals(humanD, h);
        assertEquals(orkD, o);
        assertEquals(elfD, e);
    }

}