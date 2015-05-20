package lesson_7.simpleRPG;

import java.util.Random;

/**
 * Created by Igor on 20.05.2015.
 */
public class RealRandom implements Randomable {
    @Override
    public double random() {
        return new Random().nextDouble();
    }
}
