package com.hillel.java.swing;

import javax.swing.*;

/**
 * Created by ITyan on 21.05.2015.
 */
public class Calculator extends JFrame {

    private JTextField textField1;

    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton plusButton;
    private JButton equalButton;
    private JPanel panel;

    public Calculator() {

        a1Button.setActionCommand("1");
        a2Button.setActionCommand("2");
        a3Button.setActionCommand("3");
        a4Button.setActionCommand("4");
        a5Button.setActionCommand("5");
        a6Button.setActionCommand("6");
        a7Button.setActionCommand("7");
        a8Button.setActionCommand("8");
        a9Button.setActionCommand("9");
        a0Button.setActionCommand("0");
        plusButton.setActionCommand("+");
        equalButton.setActionCommand("=");

        NumberListener numberListener = new NumberListener(textField1);

        a1Button.addActionListener(numberListener);
        a2Button.addActionListener(numberListener);
        a3Button.addActionListener(numberListener);
        a4Button.addActionListener(numberListener);
        a5Button.addActionListener(numberListener);
        a6Button.addActionListener(numberListener);
        a7Button.addActionListener(numberListener);
        a8Button.addActionListener(numberListener);
        a9Button.addActionListener(numberListener);
        a0Button.addActionListener(numberListener);
        plusButton.addActionListener(numberListener);
        equalButton.addActionListener(numberListener);

        setContentPane(panel);

        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
