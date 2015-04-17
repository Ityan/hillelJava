package lesson_3.GuessTheNumber;

import java.util.Random;

/**
 * @author ITyan on 14.04.2015.
 */
public class GuessTheNumber {

    static final int MAX_VALUE = 10;
    static final int MIN_VALUE = 1;
    private int unknownNumber;
    private int count;

    /**
     * checks the condition for victory
     * if result positive number your number is more
     * if result negative number your number is less
     * if result = 0 your number is guess
     *
     * @param yourNumber inputted number
     * @return text for the definition of victory
     */
    public int checkWin(int yourNumber) {
        count++;
        return unknownNumber - yourNumber;
    }

    /**
     * generates a random number in the range
     * from MIN_VALUE to MAX_VALUE
     *
     * @return random number
     */
    public int getRandomNumber() {
        Random rnd = new Random();
        unknownNumber = rnd.nextInt(MAX_VALUE) + 1;
        return unknownNumber;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
