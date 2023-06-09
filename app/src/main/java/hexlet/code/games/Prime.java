package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import hexlet.code.Engine;

public class Prime {
    public static void guessPrimeNumber() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[Engine.TOTAL_CORRECT_ANSWERS][2];
        for (int i = 0; i < rounds.length; i++) {
            int number = RandomUtils.nextInt(2, Engine.MAX_RANDOM_NUM);
            boolean answer = isNumberPrime(number);
            rounds[i][0] = "Question: " + number;
            if (answer) {
                rounds[i][1] = "yes";
            } else {
                rounds[i][1] = "no";
            }
        }
        Engine.doLogic(description, rounds);
    }
    public static boolean isNumberPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

