package lesson_7.RPG_Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @author ITyan on 03.06.2015.
 */
public class Main extends JFrame {

    private JPanel panel;
    private JProgressBar health1;
    private JProgressBar health2;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;

    private Personage player1;
    private Personage player2;

    private Random random = new Random();


    public Main() {
        setContentPane(panel);
        setTitle("SIMPLE RPG");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        createPersonages();

        attack(button1, player1, player2, health2);
        attack(button2, player2, player1, health1);
    }

    public static void main(String[] args) {
        new Main();
    }

    public void createPersonages() {
        player1 = randomPersonage();
        player1.setWeapon(randomWeapon());
        player1.setArmor(randomArmor());

        player2 = randomPersonage();
        player2.setWeapon(randomWeapon());
        player2.setArmor(randomArmor());

        label1.setText(player1.toString());
        label2.setText(player2.toString());
    }

    public void attack(JButton attackButton, Personage attackingPers, Personage defendingPers, JProgressBar defendHealthBar) {
        attackButton.addActionListener(new ActionListener() {
            int hp = defendingPers.getHealth();
            int result;
            @Override
            public void actionPerformed(ActionEvent e) {
                hp -= attackingPers.takeHealth(defendingPers);
                result = hp * 100 / defendingPers.getHealth();
                defendHealthBar.setValue(result);
                defendHealthBar.setString("Health " + result + " %");
                if (result <= 0) {
                    JOptionPane.showMessageDialog(null, attackingPers.getName() + " - WIN!");
                    System.exit(0);
                }
            }
        });
    }

    public Personage randomPersonage() {
        String name = null;
        Damage bonus = null;
        int health = 0;

        int personageChoice = random.nextInt(3);

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

        return new Personage(name, bonus, health);
    }

    public Weapon randomWeapon() {
        String name = null;
        Damage min = null;
        Damage max = null;

        int randomWeaponChoice = random.nextInt(3);

        if (randomWeaponChoice == 0) {
            name = "Sword";
            min = new Damage(6, 0, 0);
            max = new Damage(9, 0, 0);
        }
        if (randomWeaponChoice == 1) {
            name = "Hammer";
            min = new Damage(0, 7, 0);
            max = new Damage(0, 8, 0);
        }
        if (randomWeaponChoice == 2) {
            name = "Bow";
            min = new Damage(0, 0, 5);
            max = new Damage(0, 0, 10);
        }

        return new Weapon(name, min, max);
    }

    public Armor randomArmor() {
        String name = null;
        int defence = 0;

        int randomArmorChoice = random.nextInt(3);

        if (randomArmorChoice == 0) {
            name = "Helmet";
            defence = 7;
        }
        if (randomArmorChoice == 1) {
            name = "Breastplate";
            defence = 14;
        }
        if (randomArmorChoice == 2) {
            name = "Greaves";
            defence = 10;
        }

        return new Armor(name, defence);
    }
}
