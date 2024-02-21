package sheridan.adityasharma.assignment2.passwordstoreaditya.utilities;

import java.util.Random;

public class RandomNumberGenerator {
    public static long generateNineDigitNumber(long min, long max) {
        Random random = new Random();
        return random.nextLong(min, max);
    }


}
