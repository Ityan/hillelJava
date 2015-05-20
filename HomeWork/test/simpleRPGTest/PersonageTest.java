package simpleRPGTest;

import lesson_7.simpleRPG.Damage;
import lesson_7.simpleRPG.Personage;
import lesson_7.simpleRPG.TestRandom;
import lesson_7.simpleRPG.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ITyan on 28.04.2015.
 */
public class PersonageTest {

    @Test
    public void getPersonageDamageTest() {
        Personage human = new Personage("Human", new Damage(4, 0, 0));
        Personage ork = new Personage("Ork", new Damage(0, 3, 0));
        Personage elf = new Personage("Elf", new Damage(0, 0, 5));

        Weapon sword = new Weapon("sword", new Damage(6, 0, 0), new Damage(9, 0, 0), new TestRandom());
        Weapon hammer = new Weapon("hammer", new Damage(0, 7, 0), new Damage(0, 8, 0), new TestRandom());
        Weapon bow = new Weapon("bow", new Damage(0, 0, 5), new Damage(0, 0, 10), new TestRandom());

        human.addWeapon(sword);
        ork.addWeapon(hammer);
        elf.addWeapon(bow);

        Damage humanD = new Damage(13, 0, 0);
        Damage orkD = new Damage(0, 11, 0);
        Damage elfD = new Damage(0, 0, 15);

        Damage h = human.getPersonageDamage();
        Damage o = ork.getPersonageDamage();
        Damage e = elf.getPersonageDamage();

        assertEquals(humanD, h);
        assertEquals(orkD, o);
        assertEquals(elfD, e);
    }

}