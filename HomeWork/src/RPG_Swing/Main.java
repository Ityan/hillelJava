package RPG_Swing;

import javax.swing.*;

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

    private Personage player1 = new Personage();
    private Personage player2 = new Personage();

    public Main() {
        setContentPane(panel);
        setTitle("SIMPLE RPG");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        label1.setText(player1.toString());
        label2.setText(player2.toString());

        player1.attack(button1, player2, health2);
        player2.attack(button2, player1, health1);
    }

    public static void main(String[] args) {
        new Main();
    }
}
