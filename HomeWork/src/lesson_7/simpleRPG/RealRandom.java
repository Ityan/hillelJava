package lesson_7.simpleRPG;

import java.util.Random;

/**
 * @author ITyan on 20.05.2015.
 */
public class RealRandom implements RandomBehavior {

    private Random random = new Random();

    @Override
    public double random() {
        return random.nextDouble();
    }
}
