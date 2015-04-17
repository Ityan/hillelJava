package lesson_3.GuessTheNumber;

import java.util.Scanner;

/**
 * @author ITyan on 16.04.2015.
 */
public class GuessNumberMain {
    public static void main(String[] args) {

        GuessTheNumber gNumb = new GuessTheNumber();
        ArtificialIntelligence ai = new ArtificialIntelligence();

        int unknownNumber = gNumb.getRandomNumber();

        pcVShuman(gNumb, unknownNumber);
        
        pcVSpc(gNumb, ai, unknownNumber);

    }

    public static void pcVSpc(GuessTheNumber gNumb, ArtificialIntelligence ai, int unknownNumber) {
        CheckResult result = CheckResult.NULL;
        gNumb.setCount(1);
        System.out.println("\nPC guesses the number from " + gNumb.MIN_VALUE + " to " + gNumb.MAX_VALUE);

        do {
            System.out.print("Insert your number: ");

            int number = ai.findNumber(result);
            result = gNumb.checkWin(number);

            if (result.equals(CheckResult.LESS)) {
                System.out.println("Your number: " + number + " is less.");
            } else if (result.equals(CheckResult.MORE)) {
                System.out.println("Your number: " + number + " is more.");
            } else {
                System.out.println("Congratulations!!!\nYou guessed number " + unknownNumber
                        + " for " + gNumb.getCount() + " attempts");
            }
        } while (!(result.equals(CheckResult.WIN)));
    }

    public static void pcVShuman(GuessTheNumber gNumb, int unknownNumber) {
        CheckResult result;
        Scanner in = new Scanner(System.in);
        gNumb.setCount(1);
        System.out.println("Guess number from " + gNumb.MIN_VALUE + " to " + gNumb.MAX_VALUE);
        do {
            System.out.print("Insert your number: ");

            int number = in.nextInt();
            result = gNumb.checkWin(number);

            if (result.equals(CheckResult.LESS)) {
                System.out.println("Your number: " + number + " is less.");
            } else if (result.equals(CheckResult.MORE)) {
                System.out.println("Your number: " + number + " is more.");
            } else {
                System.out.println("Congratulations!!!\nYou guessed number " + unknownNumber
                    + " for " + gNumb.getCount() + " attempts");
            }
        } while (!(result.equals(CheckResult.WIN)));
    }
}
