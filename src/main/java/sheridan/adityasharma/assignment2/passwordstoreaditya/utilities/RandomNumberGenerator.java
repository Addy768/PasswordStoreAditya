package sheridan.adityasharma.assignment2.passwordstoreaditya.utilities;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateSixDigitNumber() {
        Random random = new Random();
        return random.nextInt(900000) + 100000; // Generates a number between 100000 and 999999
    }


}
