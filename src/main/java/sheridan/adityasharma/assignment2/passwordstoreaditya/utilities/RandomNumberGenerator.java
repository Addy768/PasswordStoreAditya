package sheridan.adityasharma.assignment2.passwordstoreaditya.utilities;

import java.util.Random;

public class RandomNumberGenerator {

    // This function generates a random long number between a given range (min and max).
    public static long generateNineDigitNumber(long min, long max) {
        // Create a new Random object
        Random random = new Random();
        // Generate a random long number between min and max, and return it
        return random.nextLong(min, max);
    }


}
