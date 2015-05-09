import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author ITyan on 09.05.2015.
 */
public class Player {

    static final int MAX_SPEED = 70;
    static final int MAX_TOP = 260;
    static final int MAX_BOTTOM = 510;

    private Image imageCenter = new ImageIcon("2D_Racing/res/Player.png").getImage();
    private Image imageLeft = new ImageIcon("2D_Racing/res/Player_Left.png").getImage();
    private Image imageRight = new ImageIcon("2D_Racing/res/Player_Right.png").getImage();

    private Image image = imageCenter;

    private int speed = 0;
    private int speedUp = 0;
    private int route = 0;

    private int x = 30;
    private int y = 400;
    private int dy = 0;

    private int layer1 = 0;
    private int layer2 = 1190;

    public Rectangle getRect() {
        return new Rectangle(x, y, 160, 56);
    }

    public void move() {
        route += speed;
        speed += speedUp;

        if (speed <= 0) {
            speed = 0;
        }
        if (speed >= MAX_SPEED) {
            speed = MAX_SPEED;
        }

        y -= dy;
        if (y <= MAX_TOP) {
            y = MAX_TOP;
        }
        if (y >= MAX_BOTTOM) {
            y = MAX_BOTTOM;
        }

        if (layer2 - speed <= 0) {
            layer1 = 0;
            layer2 = 1190;
        } else {
            layer1 -= speed;
            layer2 -= speed;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            speedUp = 3;
        }
        if (key == KeyEvent.VK_LEFT) {
            speedUp = -3;
        }
        if (key == KeyEvent.VK_UP) {
            dy = 5;
            image = imageLeft;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = -5;
            image = imageRight;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT) {
            speedUp = 0;
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
            image = imageCenter;
        }
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLayer1() {
        return layer1;
    }

    public int getLayer2() {
        return layer2;
    }

    public int getSpeed() {
        return speed;
    }

    public int getRoute() {
        return route;
    }
}
