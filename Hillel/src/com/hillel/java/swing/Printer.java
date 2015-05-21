package com.hillel.java.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ITyan on 21.05.2015.
 */
public class Printer implements ActionListener {

    private final JTextField textField;
    private JTextField output;

    public Printer(JTextField textField) {
        this.textField = textField;
    }

    public Printer(JTextField textField, JTextField output) {
        this.textField = textField;
        this.output = output;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        output.setText(textField.getText());
        textField.setText("");
    }
}
