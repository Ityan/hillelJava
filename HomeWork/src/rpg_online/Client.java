package rpg_online;

import lesson_7.RPG_Swing.GameBuilder;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author ITyan on 22.07.2015.
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

    private Socket socket;
    private ObjectInputStream input;
    private PrintWriter output;

    /**
     * Constructor a client's object
     *
     * @param host IP address or localhost
     * @param port Port for a connection to server
     * @throws IOException If could not connections, throws an exception
     *                     to interrupt the creation of an object
     */
    public Client(String host, int port) throws IOException {

        setContentPane(panel);
        setTitle("SIMPLE RPG");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        historyLabel.setText("The battle started!");

        socket = new Socket(host, port);
        input = new ObjectInputStream(socket.getInputStream());
        output = new PrintWriter(socket.getOutputStream());
        new Thread(new Receiver()).start();
    }

    public static void main(String[] args) {
        try {
            new Client("localhost", 7777).start();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unable to connect. rpg_online.Server not running?");
            System.exit(0);
        }
    }

    public void start() {
        button1.addActionListener(e -> sentBtn1Pressed());
        button2.addActionListener(e -> sentBtn2Pressed());
    }

    private void sentBtn1Pressed() {
        String t = "btn1";
        output.println(t);
        output.flush();
    }

    private void sentBtn2Pressed() {
        String t = "btn2";
        output.println(t);
        output.flush();
    }

    /**
     * Method closes the connection and exits the program
     */
    public synchronized void close() {
        if (!socket.isClosed()) {
            try {
                socket.close();
                System.exit(0);
            } catch (IOException ignored) {
            }
        }
    }

    /**
     * Repaint frame
     *
     * @param game Object from server side
     */
    public void repaint(GameBuilder game) {
        label1.setText(game.getPlayer1().toString());
        label2.setText(game.getPlayer2().toString());

        health1.setValue(game.getPlayer1().getHealth() * 100 / game.getPlayer1().getMaxHealth());
        health1.setString("Health " + (game.getPlayer1().getHealth() * 100 / game.getPlayer1().getMaxHealth()) + " %");

        health2.setValue(game.getPlayer2().getHealth() * 100 / game.getPlayer2().getMaxHealth());
        health2.setString("Health " + (game.getPlayer2().getHealth() * 100 / game.getPlayer2().getMaxHealth()) + " %");

//        button1.setEnabled(game.isP1ReadyToAttack());
//        button2.setEnabled(game.isP2ReadyToAttack());
    }

    /**
     * Inner private class asynchronous read
     */
    private class Receiver implements Runnable {

        @Override
        public void run() {
            GameBuilder game = null;
            while (!socket.isClosed()) {
                try {
                    game = (GameBuilder) input.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Connection lost");
                    close();
                }
                if (game != null) {
                    repaint(game);
                }
            }
        }
    }
}
