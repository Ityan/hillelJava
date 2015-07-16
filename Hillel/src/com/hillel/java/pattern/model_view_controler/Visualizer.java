package com.hillel.java.pattern.model_view_controler;

import javax.swing.*;

/**
 * @author ITyan on 16.07.2015.
 */
public class Visualizer extends JFrame implements BeatObserver{

    private JPanel panel;
    private JProgressBar progressBar;

    public Visualizer() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);

        initProgressBar();
    }

    private void initProgressBar() {
        progressBar.setMaximum(10);
    }

    @Override
    public void beat() {
        new Thread(() -> {
            progressBar.setValue(7);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {}

            progressBar.setValue(10);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {}

            progressBar.setValue(3);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {}

            progressBar.setValue(0);
        }).start();

    }
}
