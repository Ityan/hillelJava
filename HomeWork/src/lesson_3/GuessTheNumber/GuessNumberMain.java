package lesson_3.GuessTheNumber;

import java.util.Scanner;

/**
 * @author ITyan on 16.04.2015.
 */
public class GuessNumberMain {
    public static void main(String[] args) {
        GuessTheNumber gNumb = new GuessTheNumber();
        ArtificialIntelligence ai = new ArtificialIntelligence();
        Scanner in = new Scanner(System.in);
        int unknownNumber = gNumb.getRandomNumber();

        pcVShuman(gNumb, in, unknownNumber);
        
        pcVSpc(gNumb, ai, unknownNumber);

    }

    public static void pcVSpc(GuessTheNumber gNumb, ArtificialIntelligence ai, int unknownNumber) {
        gNumb.setCount(1);
        String answerText = "a";
        System.out.println("\nPC guesses the number from " + gNumb.MIN_VALUE + " to " + gNumb.MAX_VALUE);

        do {
            System.out.print("Insert your number: ");

            int number = ai.findNumber(answerText);
            answerText = gNumb.checkWin(number);

            if (answerText.equals("less")) {
                System.out.println("Your number: " + number + " is less.");
            } else if (answerText.equals("more")) {
                System.out.println("Your number: " + number + " is more.");
            } else {
                System.out.println("Congratulations!!!\nYou guessed number " + unknownNumber
                        + " for " + gNumb.getCount() + " attempts");
            }
        } while (!(answerText.equals("win")));
    }

    public static void pcVShuman(GuessTheNumber gNumb, Scanner in, int unknownNumber) {
        gNumb.setCount(1);
        String answerText;
        System.out.println("Guess number from " + gNumb.MIN_VALUE + " to " + gNumb.MAX_VALUE);
        do {
            System.out.print("Insert your number: ");

            int number = in.nextInt();
            answerText = gNumb.checkWin(number);

            if (answerText.equals("less")) {
                System.out.println("Your number: " + number + " is less.");
            } else if (answerText.equals("more")) {
                System.out.println("Your number: " + number + " is more.");
            } else {
                System.out.println("Congratulations!!!\nYou guessed number " + unknownNumber
                    + " for " + gNumb.getCount() + " attempts");
            }
        } while (!(answerText.equals("win")));
    }
}
