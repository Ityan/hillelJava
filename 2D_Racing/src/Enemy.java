import javax.swing.*;
import java.awt.*;

/**
 * @author ITyan on 09.05.2015.
 */
public class Enemy {

    private int x;
    private int y;
    private int speed;
    private Image image = new ImageIcon("2D_Racing/res/Enemy.png").getImage();
    private Road road;

    public Enemy(int x, int y, int speed, Road road) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.road = road;
    }

    public Rectangle getRect() {
        return new Rectangle(x, y, 138, 62);
    }

    public void move() {
        x = x - road.getPlayer().getSpeed() + speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
}
