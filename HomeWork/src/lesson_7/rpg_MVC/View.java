package lesson_7.rpg_MVC;

import javax.swing.*;
import java.awt.*;

/**
 * @author ITyan on 22.07.2015.
 */
public class View extends JFrame implements GameObserver{

    private JPanel panel;
    private JProgressBar health1;
    private JProgressBar health2;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JLabel historyLabel;

    private Controller controller;
    private Model model;

    public View(Controller controller, Model model) throws HeadlessException {
        this.controller = controller;
        this.model = model;

        setContentPane(panel);
        setTitle("SIMPLE RPG");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(600, 400);
        setLocationRelativeTo(null);

        initBtn1();
        initBtn2();
        updateFrame();

        setVisible(true);
    }

    private void initBtn1() {
        button1.addActionListener(e -> controller.btn1Pressed());
    }

    private void initBtn2() {
        button2.addActionListener(e -> controller.btn2Pressed());
    }

    public void firstBtnEnabled(boolean enabled) {
        button1.setEnabled(enabled);
    }

    public void secondBtnEnabled(boolean enabled) {
        button2.setEnabled(enabled);
    }

    @Override
    public void gameChanged() {
        updateFrame();
    }

    private void updateFrame() {
        label1.setText(model.getPlayer1Name());
        label2.setText(model.getPlayer2Name());

        health1.setValue(model.getHealth1Value());
        health1.setString(model.getString1Value());

        health2.setValue(model.getHealth2Value());
        health2.setString(model.getString2Value());

        historyLabel.setText(model.getHistoryText());

        controller.checkGameOver();
    }

    public void endGame(){
        historyLabel.setText(model.getHistoryText());
        JOptionPane.showMessageDialog(null, model.getEndGameMessage());
        System.exit(EXIT_ON_CLOSE);
    }
}
