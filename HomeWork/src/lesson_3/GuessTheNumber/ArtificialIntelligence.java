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
     * @param text defines the upper and lower limits search
     * @return number, which must be equal to the required number
     */
    public int findNumber(String text) {
        if (text.equals("less")) {
            bottom = number;
        } else if (text.equals("more")) {
            top = number;
        }
        number = ((top - bottom) / 2) + bottom;
        return number;
    }

}
