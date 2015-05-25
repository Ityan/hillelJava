package com.hillel.java.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ITyan on 25.05.2015.
 */
public class NextForm extends JFrame{

    private JButton exitButton;
    private JPanel panel1;
    private JList list1;
    private JButton addButton;

    public NextForm() {
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Do you want exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });

        DefaultListModel listModel = new DefaultListModel();
        list1.setModel(listModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.add(listModel.getSize(), "asd");
            }
        });
    }


    public static void main(String[] args) {
        new NextForm();
    }
}
