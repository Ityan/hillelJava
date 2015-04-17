package lesson_3.GuessTheNumber;

/**
 * @author ITyan on 16.04.2015.
 */
public class ArtificialIntelligence {
    private int top = GuessTheNumber.MAX_VALUE;
    private int bottom = GuessTheNumber.MIN_VALUE;
    private int number;

    /**
     * Find a number
     *
     * @param result defines the upper and lower limits search
     * @return number, which must be equal to the required number
     */
    public int findNumber(int result) {
        if (result > 0) {
            bottom = number;
        } else if (result < 0) {
            top = number;
            if (top == 9) {
                top = 10;
            }
        }
        number = ((top - bottom) / 2) + bottom;
        return number;
    }

}
