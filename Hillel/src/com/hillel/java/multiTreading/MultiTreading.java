package com.hillel.java.multiTreading;

import java.time.Instant;

/**
 * Created by ITyan on 18.06.2015.
 */
public class MultiTreading {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        SecondThread secondThread = new SecondThread();
        secondThread.start();

        //secondThread.run();

//        System.out.println("I'm falling asleep");
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException ignored) { }
//        System.out.println("I've been awacked" + Instant.now());

        //secondThread.interrupt();

        try {
            secondThread.join();
        } catch (InterruptedException ignored) {}

        System.out.println("end");
    }

}
