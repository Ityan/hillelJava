package lesson_7.RPG_Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

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
    private JLabel historyLabel;

    private Battlefield bf = new Battlefield();

    public Main() {
        setContentPane(panel);
        setTitle("SIMPLE RPG");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        label1.setText(bf.getPlayer1().toString());
        label2.setText(bf.getPlayer2().toString());

        historyLabel.setText("The battle started!");

        attack(button1, bf.getPlayer1(), bf.getPlayer2(), health2);
        attack(button2, bf.getPlayer2(), bf.getPlayer1(), health1);
    }

    public static void main(String[] args) {
        new Main();
    }

    public void attack(JButton attackButton, Personage attackingPers, Personage defendingPers, JProgressBar defendHealthBar) {
        attackButton.addActionListener(new ActionListener() {
            int result;

            @Override
            public void actionPerformed(ActionEvent e) {
                result = defendingPers.takeHealth(attackingPers.getPersonageDamage());
                defendHealthBar.setValue(result);
                defendHealthBar.setString("Health " + result + " %");

                historyLabel.setText(attackingPers.getName() + " attacks " + defendingPers.getName() +
                        " in " + attackingPers.getPersonageDamage() + " points damage.");

                if (defendingPers.isDead()) {
                    historyLabel.setText("END GAME");
                    JOptionPane.showMessageDialog(null, attackingPers.getName() + " - WIN!");
                    System.exit(0);
                }
            }
        });

        initMenuBar();
    }

    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        JMenuItem saveItem = new JMenuItem("Save");
        menuFile.add(saveItem);

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Battlefield.save(bf);
            }
        });

        JMenuItem loadItem = new JMenuItem("Load");
        menuFile.add(loadItem);

        loadItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bf = Battlefield.load();
            }
        });
    }
}
