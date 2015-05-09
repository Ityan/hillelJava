import javax.swing.*;

/**
 * @author ITyan on 09.05.2015.
 */
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("RACING 2D");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1100, 600);
        frame.add(new Road());
        frame.setVisible(true);

    }
}
