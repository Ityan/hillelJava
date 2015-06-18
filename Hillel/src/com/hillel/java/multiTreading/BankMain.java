package com.hillel.java.multiTreading;

/**
 * Created by ITyan on 18.06.2015.
 */
public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bankier bankier1 = new Bankier(bank);
        Bankier bankier2 = new Bankier(bank);

        bankier1.start();
        bankier2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        bankier1.interrupt();
        bankier2.interrupt();

        try {
            bankier1.join();
        } catch (InterruptedException e) {}

        try {
            bankier2.join();
        } catch (InterruptedException e) {}

        System.out.println(bank);
    }
}
