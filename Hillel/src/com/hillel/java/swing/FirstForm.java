package com.hillel.java.swing;

import javax.swing.*;

/**
 * Created by ITyan on 21.05.2015.
 */
public class FirstForm extends JFrame {

    private JPanel panel;
    private JButton exitButton;
    private JTextField textField;
    private JButton printButton;
    private JTextField output;

    public FirstForm() {
        setContentPane(panel);
        setTitle("");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        QuitAction quitAction = new QuitAction();
        exitButton.addActionListener(quitAction);

        Printer printer = new Printer(textField, output);
        printButton.addActionListener(printer);
    }

    public static void main(String[] args) {
        new FirstForm();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
