package lesson_7.RPG_Swing;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @author ITyan on 17.05.2015.
 */
public class Personage {

    private Weapon weapon;
    private Armor armor;
    private Damage bonus;
    private String name;
    private int health;

    public Personage() {
        weapon = new Weapon();
        armor = new Armor();
        int personageChoice = new Random().nextInt(3);
        if (personageChoice == 0) {
            name = "Human";
            bonus = new Damage(6, 0, 0);
            health = 100;
        }
        if (personageChoice == 1) {
            name = "Ork";
            bonus = new Damage(0, 7, 0);
            health = 110;
        }
        if (personageChoice == 2) {
            name = "Elf";
            bonus = new Damage(0, 0, 5);
            health = 90;
        }
    }

    public Damage getPersonageDamage() {
        Damage damage = new Damage();
        damage.plusDamage(weapon.getDamage());
        damage.plusDamage(bonus);
        return damage;
    }

    public void attack(JButton button, Personage personage, JProgressBar healthBar) {
        button.addActionListener(new ActionListener() {
            int dmg = getPersonageDamage().inHealthBarDamage();
            int hp = personage.health;
            int result;

            @Override
            public void actionPerformed(ActionEvent e) {
                hp -= dmg - (dmg / 100 * armor.getDefence());
                result = hp * 100 / personage.health;
                healthBar.setValue(result);
                healthBar.setString("Health " + result + " %");
                if (result <= 0) {
                    JOptionPane.showMessageDialog(null, name + " - WIN!");
                    System.exit(0);
                }
            }
        });
    }

    @Override
    public String toString() {
        return "<html>Name: " + name +
                "<li>Weapon: " + weapon.getName() +
                "<li>Armor: " + armor.getName() + "</html>";
    }
}