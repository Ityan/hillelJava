package com.hillel.java.multiTreading.producerConcumer;

/**
 * @author ITyan on 22.06.2015.
 */
public class Bucket {
    private volatile int count;
    private static int maxCount = 50;

    public void put() {
        synchronized (this) {
            while (count == maxCount) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            count++;
            notify();
        }
    }

    public synchronized void get() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        count--;
        notify();
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "count=" + count +
                '}';
    }
}
