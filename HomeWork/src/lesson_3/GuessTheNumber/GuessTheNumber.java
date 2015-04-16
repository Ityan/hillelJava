package lesson_3.GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ITyan on 14.04.2015.
 */
public class GuessTheNumber {

    static final int MAX_VALUE = 10;
    static final int MIN_VALUE = 1;
    private int yourNumber;
    private int unknownNumber;
    private int count = 1;


    public void checkWin(int yourNumber) {
        if (yourNumber > unknownNumber) {
            System.out.println("Your number: " + yourNumber + " is more.");
            count++;
        } else if (yourNumber < unknownNumber) {
            System.out.println("Your number: " + yourNumber + " is less.");
            count++;
        } else {
            System.out.println("Congratulations!!!\nYou guessed number " + unknownNumber
                    + " for " + count + " attempts");
        }
    }

    public int insertNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your number: ");
        if (in.hasNextInt()) {
            yourNumber = in.nextInt();
        } else {
            System.out.println("Your insert not integer!");
        }
        return yourNumber;
    }

    public void guessTime() {
        Random rnd = new Random();
        unknownNumber = rnd.nextInt(MAX_VALUE) + 1;
        do {
            yourNumber = insertNumber();
            checkWin(yourNumber);
        } while (yourNumber != unknownNumber);
    }
}
