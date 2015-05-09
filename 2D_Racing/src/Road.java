import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author ITyan on 09.05.2015.
 */
public class Road extends JPanel implements ActionListener, Runnable {

    private Timer mainTimer = new Timer(20, this);

    private Image roadImage = new ImageIcon("2D_Racing/res/road.png").getImage();

    private Player player = new Player();

    private Thread enemiesFactory = new Thread(this);

    private List<Enemy> enemies = new ArrayList<Enemy>();

    public Road() {
        mainTimer.start();
        enemiesFactory.start();
        addKeyListener(new MyKeyAdapter());
        setFocusable(true);
    }

    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(5000));
                enemies.add(new Enemy(1300,
                        (player.MAX_TOP +
                                random.nextInt(player.MAX_BOTTOM - player.MAX_TOP)),
                        random.nextInt(30), this));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(roadImage, player.getLayer1(), 0, null);
        g.drawImage(roadImage, player.getLayer2(), 0, null);
        g.drawImage(player.getImage(), player.getX(), player.getY(), null);

        double speed = (70 / Player.MAX_SPEED) * player.getSpeed();
        g.setColor(Color.GREEN);
        Font font = new Font("Arial", Font.ITALIC, 20);
        g.setFont(font);
        g.drawString("SPEED: " + speed + "Mp/h", 100, 30);

        Iterator<Enemy> iterator = enemies.iterator();
        while (iterator.hasNext()) {
            Enemy e = iterator.next();
            if (e.getX() >= 2400 || e.getY() <= -2400) {
                iterator.remove();
            } else {
                e.move();
                g.drawImage(e.getImage(), e.getX(), e.getY(), null);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.move();
        repaint();
        testCollisionWithEnemies();
        win();
    }

    public Player getPlayer() {
        return player;
    }

    private void testCollisionWithEnemies() {
        Iterator<Enemy> iterator = enemies.iterator();
        while (iterator.hasNext()) {
            Enemy e = iterator.next();
            if (player.getRect().intersects(e.getRect())) {
                JOptionPane.showMessageDialog(null, "You loose!");
                System.exit(1);
            }
        }
    }

    public void win() {
        if (player.getRoute() >= 100000) {
            JOptionPane.showMessageDialog(null, "You WIN!");
            System.exit(1);
        }
    }
}
