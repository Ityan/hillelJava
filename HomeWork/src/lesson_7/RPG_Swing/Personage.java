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

    public Personage(String name, Damage bonus, int health) {
        this.name = name;
        this.bonus = bonus;
        this.health = health;
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

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public Armor getArmor() {
        return armor;
    }

    public String getName() {
        return name;
    }
}