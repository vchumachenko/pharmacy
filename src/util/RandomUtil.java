package util;

import java.util.Random;

public final class RandomUtil {

    private static final Random RANDOM = new Random();


    public RandomUtil() {
    }

    public static int get(int max) {
        return RANDOM.nextInt(max);

    }

}
