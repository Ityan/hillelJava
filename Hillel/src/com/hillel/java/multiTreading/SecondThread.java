package com.hillel.java.multiTreading;

import java.time.Instant;

/**
 * Created by ITyan on 18.06.2015.
 */
public class SecondThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        String message = new String("message");

        int counter = 0;
        while (!Thread.currentThread().isInterrupted() && counter < 10) {

            counter++;
            System.out.println(message + Instant.now());

            //Thread.currentThread().interrupt();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
