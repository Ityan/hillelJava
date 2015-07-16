package com.hillel.java.pattern.model_view_controler;

import javax.swing.*;

/**
 * @author ITyan on 16.07.2015.
 */
public class DjPanel extends JFrame implements  BpmObserver{

    private JPanel panel;
    private JButton increaseButton;
    private JButton decreaseButton;
    private JLabel label;

    private Controller controller;
    private Model model;

    public DjPanel(Controller controller, Model model) {
        this.controller = controller;
        this.model = model;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);

        initDecBtn();
        initIncBtn();
        updateBpm();
    }

    private void updateBpm() {
        label.setText(String.valueOf(model.getBpm()));
    }

    private void initIncBtn() {
        increaseButton.addActionListener(e -> controller.increaseBtnPressed());
    }

    private void initDecBtn() {
        decreaseButton.addActionListener(e -> controller.decreaseBtnPressed());
    }

    @Override
    public void bpmChanged() {
        updateBpm();
    }

    public void decreaseBtnEnabled(boolean enabled) {
        decreaseButton.setEnabled(enabled);
    }

    public void increaseBtnEnabled(boolean enabled) {
        increaseButton.setEnabled(enabled);
    }
}
