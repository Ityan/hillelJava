package lesson_7.client_server.test;

import lesson_7.client_server.game.GameBuilder;
import lesson_7.client_server.game.Personage;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author ITyan on 03.06.2015.
 */
public class Client extends JFrame {

    private JPanel panel;
    private JProgressBar health1;
    private JProgressBar health2;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JLabel historyLabel;

    private GameBuilder game;

    private static final String HOST = "localhost";
    private static final int PORT = 5678;

    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    private Socket socket;

    public Client() {

        try {
            socket = new Socket(HOST, PORT);
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            inputStream = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        take();

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
        new Client();
    }

    private void send(GameBuilder game) {
        try {
            outputStream.writeObject(game);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void take() {
        try {
            game = (GameBuilder) inputStream.readObject();
            repaint();
            System.out.println(game);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void attack() {
        repaint();

        button1.addActionListener(e -> {
            buttonAction(game.getPlayer1(), game.getPlayer2(), health2);
            game.setP1ReadyToAttack(false);
            game.setP2ReadyToAttack(true);
            button1.setEnabled(game.isP1ReadyToAttack());
            button2.setEnabled(game.isP2ReadyToAttack());
        });

        button2.addActionListener(e -> {
            buttonAction(game.getPlayer2(), game.getPlayer1(), health1);
            game.setP1ReadyToAttack(true);
            game.setP2ReadyToAttack(false);
            button1.setEnabled(game.isP1ReadyToAttack());
            button2.setEnabled(game.isP2ReadyToAttack());
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
            System.exit(EXIT_ON_CLOSE);
        }
        send(game);
        take();
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

        button1.setEnabled(game.isP1ReadyToAttack());
        button2.setEnabled(game.isP2ReadyToAttack());
    }
}
