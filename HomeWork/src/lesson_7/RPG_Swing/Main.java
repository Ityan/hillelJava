package lesson_7.RPG_Swing;

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
    private JLabel historyLabel;

    private GameBuilder game = new GameBuilder();

    public Main() {
        setContentPane(panel);
        setTitle("SIMPLE RPG");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        initMenuBar();
        historyLabel.setText("The battle started!");

        attack();
    }

    public static void main(String[] args) {
        new Main();
    }

    public void attack() {
        repaint();

        button1.addActionListener(e -> {
            buttonAction(game.getPlayer1(), game.getPlayer2(), health2);
            button1.setEnabled(false);
            button2.setEnabled(true);
        });

        button2.addActionListener(e -> {
            buttonAction(game.getPlayer2(), game.getPlayer1(), health1);
            button1.setEnabled(true);
            button2.setEnabled(false);
        });
    }

    private void buttonAction(Personage attackingPers, Personage defendingPers, JProgressBar defendHealthBar) {
        int result = defendingPers.takeHealth(attackingPers.getPersonageDamage());
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

    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        JMenuItem saveItem = new JMenuItem("Save");
        menuFile.add(saveItem);

        saveItem.addActionListener(e -> GameBuilder.save(game));

        JMenuItem loadItem = new JMenuItem("Load");
        menuFile.add(loadItem);

        loadItem.addActionListener(e -> {
            game = GameBuilder.load();
            historyLabel.setText(game.getPlayer1().getName() + " VS " + game.getPlayer2().getName());
            repaint();
        });
    }

    @Override
    public void repaint() {
        label1.setText(game.getPlayer1().toString());
        label2.setText(game.getPlayer2().toString());

        health1.setValue(game.getPlayer1().getHealth() * 100 / game.getPlayer1().getMaxHealth());
        health1.setString("Health " + (game.getPlayer1().getHealth() * 100 / game.getPlayer1().getMaxHealth()) + " %");

        health2.setValue(game.getPlayer2().getHealth() * 100 / game.getPlayer2().getMaxHealth());
        health2.setString("Health " + (game.getPlayer2().getHealth() * 100 / game.getPlayer2().getMaxHealth()) + " %");
    }
}
