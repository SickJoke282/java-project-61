package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GCD {
    public static void findGCD() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[Engine.TOTAL_CORRECT_ANSWERS][2];
        for (int i = 0; i < rounds.length; i++) {
            int randomNum1 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int randomNum2 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int answer = calculateGCD(randomNum1, randomNum2);
            rounds[i][0] = randomNum1 + " " + randomNum2;
            rounds[i][1] = Integer.toString(answer);
        }
        Engine.doLogic(description, rounds);
    }
    public static int calculateGCD(int num1, int num2) {
        if (num2 != 0) {
            return calculateGCD(num2, num1 % num2);
        } else {
            return num1;
        }
    }
}
