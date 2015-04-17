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
     * @param yourNumber inputted number
     * @return text for the definition of victory
     */
    public CheckResult checkWin(int yourNumber) {
        CheckResult result;
        if (yourNumber > unknownNumber) {
            result = CheckResult.MORE;
            count++;
        } else if (yourNumber < unknownNumber) {
            result = CheckResult.LESS;
            count++;
        } else {
            result = CheckResult.WIN;
        }
        return result;
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
